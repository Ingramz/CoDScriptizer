grammar CoDScript;

// Include statements have to be before everything else. Function definitions, animtree delcarations can be shuffled.
program
    :   includeStatement* (functionDefinition|outerDeveloperComment|usingAnimtreeStatement)*
    ;

// #include path\to\file;
includeStatement
    :   Include filePath Semi
    ;

// #using_animtree("animtree_name");
usingAnimtreeStatement
    :   UsingAnimtree LeftParen StringLiteral RightParen Semi
    ;

// funcname(arg1, arg2, arg3, ...) { code }
functionDefinition
    :   name=Identifier LeftParen (Identifier (Comma Identifier)*)? RightParen codeBlock
    ;

// /# funcname(arg1, arg2, arg3, ...) { code } #/
outerDeveloperComment
    :   DeveloperCommentOpen functionDefinition* DeveloperCommentClose
    ;

// { code }
codeBlock
    :   LeftBrace statement* RightBrace
    ;

// /# code #/
innerDeveloperComment
    :   DeveloperCommentOpen statement* DeveloperCommentClose
    ;

// Anything that ends or could end with a semicolon inside codeBlock
statement
    :   optionallyTerminatedStatement Semi?
    |   terminatedStatement Semi
    |   Semi+
    ;

// Statements that regularly have to be terminated with a semicolon
terminatedStatement
    :   assignment
    |   incrementDecrement
    |   functionCallStatement
    |   waitStatement
    |   returnStatement
    |   breakStatement
    |   breakpointStatement
    |   continueStatement
    |   waittillframeendStatement
    |   endonStatement
    |   waittillStatement
    |   notifyStatement
    ;

// Statements where semicolon in the end is not important
optionallyTerminatedStatement
    :   codeBlock
    |   switchStatement
    |   whileLoop
    |   forLoop
    |   ifStatement
    |   innerDeveloperComment
    ;

functionCallStatement
    :   functionCall
    ;

// wait [float]
waitStatement
    :   Wait expression
    ;

// return [any value]
returnStatement
    :   Return expression   # ReturnWithValue
    |   Return              # ReturnWithoutValue
    ;

// break
breakStatement
    :   Break
    ;

// breakpoint
breakpointStatement
    :   Breakpoint
    ;

// continue
continueStatement
    :   Continue
    ;

// waittillframeend
waittillframeendStatement
    :   Waittillframeend
    ;

// [entity] notify([string], [any value], [any value], ...)
notifyStatement
    :   containerValue Notify LeftParen expression (Comma expression)* RightParen
    ;

// [entity] endon([string])
endonStatement
    :   containerValue Endon LeftParen expression RightParen
    ;

// [entity] waittill([string], [lvalue], [lvalue], ...)
waittillStatement
    :   containerValue Waittill LeftParen expression (Comma lvalue)* RightParen
    ;

// while([boolean]) statement
whileLoop
    :   While LeftParen expression RightParen statement
    ;

// if([boolean]) statement else statement
ifStatement
    :   If LeftParen expression RightParen statement                             # IfStatementWithOutElse
    |   If LeftParen expression RightParen ifpart=statement Else elsepart=statement     # IfStatementWithElse
    ;

// for(statement;[boolean];statement) statement
forLoop
    :   For LeftParen (precond=terminatedStatement)? Semi expression? Semi (postcond=terminatedStatement)? RightParen statement
    ;

// ([float], [float], [float])
vector
    :   LeftParen x=expression Comma y=expression Comma z=expression RightParen
    ;

// some\file::someFunction
functionPointer
    :   filePath? Colon Colon Identifier
    ;

functionCall
    :   containerValue functionCallTail
    |   functionCallTail
    ;

functionCallTail
    :   Thread? (functionPointer|Identifier) LeftParen (expression (Comma expression)*)? RightParen                                         # StaticFunctionCall
    |   Thread? LeftBracket LeftBracket expr=expression RightBracket RightBracket LeftParen (expression (Comma expression)*)? RightParen    # DynamicFunctionCall
    ;

// switch([boolean]){ case "1": statement case 2: statement default: statement }
switchStatement
    :   Switch LeftParen expression RightParen LeftBrace caseBlock* RightBrace
    ;

caseBlock
    : switchCase+ statement*
    ;

switchCase
    :   Case StringLiteral Colon    # ConstantCaseString
    |   Case IntegerConstant Colon  # ConstantCaseInteger
    |   Default Colon               # DefaultCase
    ;

// a++ and a--
incrementDecrement
    :   lvalue PlusPlus     # Increment
    |   lvalue MinusMinus   # Decrement
    ;

assignment
    :   lvalue Assign expression            # RegularAssignment
    |   lvalue StarAssign expression        # StarAssignment
    |   lvalue DivAssign expression         # DivAssignment
    |   lvalue ModAssign expression         # ModAssignment
    |   lvalue PlusAssign expression        # PlusAssignment
    |   lvalue MinusAssign expression       # MinusAssignment
    |   lvalue LeftShiftAssign expression   # LeftShiftAssignment
    |   lvalue RightShiftAssign expression  # RightShiftAssignment
    |   lvalue AndAssign expression         # AndAssignment
    |   lvalue XorAssign expression         # XorAssignment
    |   lvalue OrAssign expression          # OrAssignment
    ;

// Expressions applicable to only left side of the assignment
lvalue
    :   Identifier                                          # lvalueIdentifier
    |   containerValue Dot Identifier                       # lvalueDotIdentifier
    |   lvalue LeftBracket expression RightBracket          # lvalueArrayAccess
    |   functionCall LeftBracket expression RightBracket    # lvalueFunctionCallArrayAccess
    |   Game LeftBracket expression RightBracket            # lvalueGameArray
    ;

// Arrays, variables, struct members which can contain values
containerValue
    :   containerValue functionCallTail                     # containerValueFunctionCall
    |   functionCallTail                                    # containerValueFunctionCallTailOnly
    |   containerValue LeftBracket expression RightBracket  # containerValueArrayAccess
    |   LeftParen containerValue RightParen                 # containerValueParens
    |   containerValue Dot Identifier                       # containerValueDotIdentifier
    |   Game                                                # containerValueGame
    |   Level                                               # containerValueLevel
    |   Self                                                # containerValueSelf
    |   Identifier                                          # containerValueIdentifier
    ;

filePath
    :   Identifier (Backslash Identifier)*
    ;

// Expression base
expression
    :   logicalOrExpression
    ;

logicalOrExpression
    :   logicalAndExpression                            # LogicalOrToLogicalAndExpression
    |   logicalOrExpression OrOr logicalAndExpression   # TrueLogicalOrExpression
    ;

logicalAndExpression
    :   inclusiveOrExpression                               # LogicalAndToInclusiveOrExpression
    |   logicalAndExpression AndAnd inclusiveOrExpression   # TrueLogicalAndExpression
    ;

inclusiveOrExpression
    :   exclusiveOrExpression                           # InclusiveOrToExclusiveOrExpression
    |   inclusiveOrExpression Or exclusiveOrExpression  # TrueInclusiveOrExpression
    ;

exclusiveOrExpression
    :   andExpression                               # ExclusiveOrToAndExpression
    |   exclusiveOrExpression Caret andExpression   # TrueExclusiveOrExpression
    ;

andExpression
    :   equalityExpression                      # AndToEqualityExpression
    |   andExpression And equalityExpression    # TrueAndExpression
    ;

equalityExpression
    :   relationalExpression                                # EqualityToRelationalExpression
    |   equalityExpression Equal relationalExpression       # EqualExpression
    |   equalityExpression NotEqual relationalExpression    # NotEqualExpression
    ;

relationalExpression
    :   shiftExpression                                     # RelationalToShiftExpression
    |   relationalExpression Less shiftExpression           # LessExpression
    |   relationalExpression Greater shiftExpression        # GreaterExpression
    |   relationalExpression LessEqual shiftExpression      # LessEqualExpression
    |   relationalExpression GreaterEqual shiftExpression   # GreaterEqualExpression
    ;

shiftExpression
    :   additiveExpression                              # ShiftToAdditiveExpression
    |   shiftExpression LeftShift additiveExpression    # LeftShiftExpression
    |   shiftExpression RightShift additiveExpression   # RightShiftExpression
    ;

additiveExpression
    :   multiplicativeExpression                            # AdditiveToMultiplicativeExpression
    |   additiveExpression Plus multiplicativeExpression    # AdditionExpression
    |   additiveExpression Minus multiplicativeExpression   # SubtractionExpression
    ;

multiplicativeExpression
    :   unaryExpression                                 # MultiplicativeToUnaryExpression
    |   multiplicativeExpression Star unaryExpression   # MultiplicationExpression
    |   multiplicativeExpression Div unaryExpression    # DivisionExpression
    |   multiplicativeExpression Mod unaryExpression    # ModuloExpression
    ;

unaryExpression
    :   primaryExpression       # UnaryToPrimaryExpression
    |   Not unaryExpression     # UnaryLogicalNotExpression
    |   Tilde unaryExpression   # UnaryNotExpression
    ;

primaryExpression
    :   containerValue                  # PrimaryExpressionContainerValue
    |   vector                          # PrimaryExpressionVector
    |   Minus? FloatConstant            # PrimaryExpressionFloatConstant
    |   Minus? IntegerConstant          # PrimaryExpressionIntegerConstant
    |   StringLiteral                   # PrimaryExpressionStringLiteralConstant
    |   And StringLiteral               # PrimaryExpressionLocalizedStringConstant
    |   Mod Identifier                  # PrimaryExpressionAnimationConstant
    |   Animtree                        # PrimaryExpressionAnimtreeConstant
    |   functionPointer                 # PrimaryExpressionFunctionPointerConstant
    |   LeftParen expression RightParen # PrimaryExpressionGrouping
    |   Undefined                       # PrimaryExpressionUndefinedConstant
    |   LeftBracket RightBracket        # PrimaryExpressionEmptyArrayConstant
    |   True                            # PrimaryExpressionTrueConstant
    |   False                           # PrimaryExpressionFalseConstant
    ;


Break : 'break';
Case : 'case';
Continue : 'continue';
Default : 'default';
Else : 'else';
For : 'for';
If : 'if';
Return : 'return';
Switch : 'switch';
While : 'while';
Thread : 'thread';
Wait: 'wait';
Undefined: 'undefined';
True: 'true';
False: 'false';
Endon: 'endon';
Notify: 'notify';
Breakpoint: 'breakpoint';
Waittillframeend: 'waittillframeend';
Waittill: 'waittill';
Self: 'self';
Level: 'level';
Game: 'game';


LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Dot : '.';
Backslash: '\\';

Include: '#include';
UsingAnimtree: '#using_animtree';
Animtree: '#animtree';
DeveloperCommentOpen: '/#';
DeveloperCommentClose: '#/';

Identifier
    :   Nondigit (Nondigit | Digit)*
    ;

fragment Nondigit
    :   'a'..'z'
    |   'A'..'Z'
    |   '_'
    ;

fragment Digit
    :   '0'..'9'
    ;

IntegerConstant
    :   DecimalConstant
    ;

FloatConstant
    :   DecimalFloatingConstant
    ;

fragment DecimalConstant
    :   (NonzeroDigit Digit*)
    |   Zero
    ;

fragment NonzeroDigit
    :   '1'..'9'
    ;

fragment Zero
    :   '0'
    ;

fragment DecimalFloatingConstant
    :   DecimalConstant? Dot Digit+
    ;

fragment EscapeSequence
    : SingleEscapeCharacter
    | NonEscapeCharacter
    ;

fragment SingleEscapeCharacter
    :   ["\\nrt]
    ;

fragment NonEscapeCharacter
    :   ~["\\nrt]
    ;

StringLiteral
    :   '"' StringCharacter* '"'
    ;

fragment StringCharacter
    : ~["\\\r\n]
    | '\\' EscapeSequence
    ;

Whitespace
    :   [ \t]+ -> skip
    ;

Newline
    : ('\r' '\n'?
    |  '\n') -> skip
    ;

BlockComment
    :   '/*' .*? '*/' -> skip
    ;

LineComment
    :   '//' ~[\r\n]* -> skip
    ;
