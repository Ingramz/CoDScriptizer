grammar CoDScript;

program
    :   include_statement* (function_definition|developer_comment_func_def|using_animtree_statement)*
    ;

// #include path\to\file;
include_statement
    :   Include file_path Semi
    ;

// #using_animtree("animtree_name");
using_animtree_statement
    :   UsingAnimtree LeftParen StringLiteral RightParen Semi
    ;

// funcname(arg1, arg2, arg3, ...) { code }
function_definition
    :   name=Identifier LeftParen (Identifier (Comma Identifier)*)? RightParen code_block
    ;

// { code }
code_block
    :   LeftBrace code_line* RightBrace
    ;

// /# code #/
developer_comment
    :   DeveloperCommentOpen code_line* DeveloperCommentClose
    ;

// /# funcname(arg1, arg2, arg3, ...) { code } #/
developer_comment_func_def
    :   DeveloperCommentOpen function_definition* DeveloperCommentClose
    ;

code_line
    :   code_line_opt_end Semi?
    |   code_line_req_end? Semi
    ;

function_call_statement
    :   rvalue? function_call
    ;

wait_statement
    :   Wait returnable
    ;

return_statement
    :   Return returnable?
    ;

break_statement
    :   Break
    ;

breakpoint_statement
    :   Breakpoint
    ;

continue_statement
    :   Continue
    ;

waittillframeend_statement
    :   Waittillframeend
    ;

code_line_req_end
    :   assignment
    |   increment_decrement
    |   function_call_statement
    |   wait_statement
    |   return_statement
    |   break_statement
    |   breakpoint_statement
    |   continue_statement
    |   waittillframeend_statement
    |   endon_statement
    |   waittill_statement
    |   notify_statement
    ;

notify_statement
    :   rvalue Notify LeftParen returnable (Comma returnable)* RightParen
    ;

endon_statement
    :   rvalue Endon LeftParen returnable RightParen
    ;

waittill_statement
    :   rvalue Waittill LeftParen returnable (Comma returnable)* RightParen
    ;

code_line_opt_end
    :   code_block
    |   switch_statement
    |   while_loop
    |   for_loop
    |   if_statement
    |   developer_comment
    ;

while_loop
    :   While LeftParen returnable RightParen code_line
    ;

if_statement
    :   if_s elseif_s* else_s?
    ;

if_s
    :   If LeftParen returnable RightParen code_line
    ;

elseif_s
    :   Else If LeftParen returnable RightParen code_line
    ;

else_s
    :   Else code_line
    ;

for_loop
    :   For LeftParen code_line_req_end? Semi returnable? Semi code_line_req_end? RightParen code_line
    ;

value
    : constant
    | rvalue
    | vector
    ;

vector
    :   LeftParen returnable Comma returnable Comma returnable RightParen
    ;

returnable
    :   LeftParen returnable RightParen                                     # Grouping
    |   Not returnable                                                      # LogicalNegationExpression
    |   Tilde returnable                                                    # BitwiseNegationExpression
    |   returnable op=(Star|Div|Mod) returnable                             # MultiplicationSubtractionExpression
    |   returnable op=(Plus|Minus) returnable                               # AddSubtractExpression
    |   returnable op=(LeftShift|RightShift) returnable                     # BitwiseShiftExpression
    |   returnable op=(Less|LessEqual|GreaterEqual|Greater) returnable      # ComparisonExpression
    |   returnable op=(Equal|NotEqual) returnable                           # EqualityExpression
    |   returnable And returnable                                           # BitwiseAndExpression
    |   returnable Caret returnable                                         # BitwiseXorExpression
    |   returnable Or returnable                                            # BitwiseOrExpression
    |   returnable AndAnd returnable                                        # LogicalAndExpression
    |   returnable OrOr returnable                                          # LogicalOrExpression
    |   value                                                               # ValueExpression
    ;

constant
    :   NumericConstant             # NumericConstant
    |   StringLiteral               # StringLiteral
    |   And StringLiteral           # LocalizedStringLiteral
    |   function_pointer            # FunctionPointer
    |   Mod animName=Identifier     # AnimationConstant
    |   True                        # True
    |   False                       # False
    |   Undefined                   # Undefined
    |   Animtree                    # Animtree
    |   LeftBracket RightBracket    # EmptyArray
    ;

function_pointer
    :   file_path? Colon Colon Identifier
    ;

function_call
    :   Thread? (function_pointer|ptr=Identifier) LeftParen (returnable (Comma returnable)*)? RightParen # StaticFunctionCall
    |   Thread? LeftBracket LeftBracket expr=returnable RightBracket RightBracket LeftParen (returnable (Comma returnable)*)? RightParen # DynamicFunctionCall
    ;

switch_statement
    :   Switch LeftParen returnable RightParen LeftBrace case_block* RightBrace
    ;

case_block
    : case_s+ code_line*
    ;

case_s
    :   Case constant Colon # ConstantCase
    |   Default Colon       # DefaultCase
    ;

increment_decrement
    :   lvalue op=(PlusPlus|MinusMinus)
    ;

assignment
    :   lvalue op=(Assign|StarAssign|DivAssign|ModAssign|PlusAssign|MinusAssign|LeftShiftAssign|RightShiftAssign|AndAssign|XorAssign|OrAssign) returnable
    ;

lvalue
    :   Identifier                                                  # lvalue_Identifier
    |   rvalue Dot Identifier                                       # lvalue_DotIdentifier
    |   lvalue LeftBracket returnable RightBracket                  # lvalue_ArrayAccess
    |   rvalue? function_call LeftBracket returnable RightBracket   # lvalue_funcall_arrayaccess
    |   Game LeftBracket returnable RightBracket                    # lvalue_GameArray
    ;

rvalue
    :   function_call                                   # rvalue_funcall
    |   rvalue function_call                            # rvalue_funcall_on
    |   rvalue LeftBracket returnable RightBracket      # rvalue_ArrayAccess
    |   LeftParen rvalue RightParen                     # rvalue_Parens
    |   rvalue Dot Identifier                           # rvalue_DotIdentifier
    |   Game                                            # rvalue_Game
    |   Level                                           # rvalue_Level
    |   Self                                            # rvalue_Self
    |   Identifier                                      # rvalue_Identifier
    ;

file_path
    : Identifier (Backslash Identifier)*
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
MinusMinus : Minus Minus;
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
Hash: '#';
Backslash: '\\';

Include: '#include';
UsingAnimtree: '#using_animtree';
Animtree: '#animtree';
DeveloperCommentOpen: '/#';
DeveloperCommentClose: '#/';

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

fragment
Nondigit
    :   'a'..'z'
    |   'A'..'Z'
    |   '_'
    ;

fragment Digit: '0'..'9';

NumericConstant: Minus? (DecimalConstant | DecimalFloatingConstant);

fragment
DecimalConstant
    :   (NonzeroDigit Digit*)
    |   Zero
    ;

fragment NonzeroDigit: '1'..'9';
fragment Zero: '0';

fragment
DecimalFloatingConstant
    :   DecimalConstant? '.' Digit+
    ;

fragment EscapeSequence
    : SingleEscapeCharacter
    | NonEscapeCharacter
    ;

fragment SingleEscapeCharacter: ["\\nrt];
fragment NonEscapeCharacter: ~["\\nrt];

StringLiteral:   '"' StringCharacter* '"';

fragment StringCharacter
    : ~["\\\r\n]
    | '\\' EscapeSequence
    ;

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment:   '/*' .*? '*/' -> skip;
LineComment:   '//' ~[\r\n]* -> skip;
