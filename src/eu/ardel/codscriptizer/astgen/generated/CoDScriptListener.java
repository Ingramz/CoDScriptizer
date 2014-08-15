package eu.ardel.codscriptizer.astgen.generated;// Generated from C:/Users/Indrek/IdeaProjects/CoDScriptizer/src/eu/ardel/codscriptizer/grammars\CoDScript.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoDScriptParser}.
 */
public interface CoDScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionLocalizedStringConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionLocalizedStringConstant(@NotNull CoDScriptParser.PrimaryExpressionLocalizedStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionLocalizedStringConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionLocalizedStringConstant(@NotNull CoDScriptParser.PrimaryExpressionLocalizedStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionContainerValue}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionContainerValue(@NotNull CoDScriptParser.PrimaryExpressionContainerValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionContainerValue}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionContainerValue(@NotNull CoDScriptParser.PrimaryExpressionContainerValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(@NotNull CoDScriptParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(@NotNull CoDScriptParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionEmptyArrayConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionEmptyArrayConstant(@NotNull CoDScriptParser.PrimaryExpressionEmptyArrayConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionEmptyArrayConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionEmptyArrayConstant(@NotNull CoDScriptParser.PrimaryExpressionEmptyArrayConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(@NotNull CoDScriptParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(@NotNull CoDScriptParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueArrayAccess(@NotNull CoDScriptParser.LvalueArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueArrayAccess(@NotNull CoDScriptParser.LvalueArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterModAssignment(@NotNull CoDScriptParser.ModAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitModAssignment(@NotNull CoDScriptParser.ModAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(@NotNull CoDScriptParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(@NotNull CoDScriptParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decrement}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(@NotNull CoDScriptParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decrement}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(@NotNull CoDScriptParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementWithOutElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementWithOutElse(@NotNull CoDScriptParser.IfStatementWithOutElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementWithOutElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementWithOutElse(@NotNull CoDScriptParser.IfStatementWithOutElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualExpression(@NotNull CoDScriptParser.LessEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualExpression(@NotNull CoDScriptParser.LessEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueIdentifier(@NotNull CoDScriptParser.ContainerValueIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueIdentifier(@NotNull CoDScriptParser.ContainerValueIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Increment}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull CoDScriptParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Increment}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull CoDScriptParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(@NotNull CoDScriptParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(@NotNull CoDScriptParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull CoDScriptParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull CoDScriptParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftShiftExpression(@NotNull CoDScriptParser.LeftShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftShiftExpression(@NotNull CoDScriptParser.LeftShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementWithElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementWithElse(@NotNull CoDScriptParser.IfStatementWithElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementWithElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementWithElse(@NotNull CoDScriptParser.IfStatementWithElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionUndefinedConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionUndefinedConstant(@NotNull CoDScriptParser.PrimaryExpressionUndefinedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionUndefinedConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionUndefinedConstant(@NotNull CoDScriptParser.PrimaryExpressionUndefinedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#filePath}.
	 * @param ctx the parse tree
	 */
	void enterFilePath(@NotNull CoDScriptParser.FilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#filePath}.
	 * @param ctx the parse tree
	 */
	void exitFilePath(@NotNull CoDScriptParser.FilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#endonStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndonStatement(@NotNull CoDScriptParser.EndonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#endonStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndonStatement(@NotNull CoDScriptParser.EndonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionFalseConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionFalseConstant(@NotNull CoDScriptParser.PrimaryExpressionFalseConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionFalseConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionFalseConstant(@NotNull CoDScriptParser.PrimaryExpressionFalseConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InclusiveOrToExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrToExclusiveOrExpression(@NotNull CoDScriptParser.InclusiveOrToExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InclusiveOrToExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrToExclusiveOrExpression(@NotNull CoDScriptParser.InclusiveOrToExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionAnimationConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionAnimationConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimationConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionAnimationConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionAnimationConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull CoDScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull CoDScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalToShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalToShiftExpression(@NotNull CoDScriptParser.RelationalToShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalToShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalToShiftExpression(@NotNull CoDScriptParser.RelationalToShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(@NotNull CoDScriptParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(@NotNull CoDScriptParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull CoDScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull CoDScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionGrouping}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionGrouping(@NotNull CoDScriptParser.PrimaryExpressionGroupingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionGrouping}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionGrouping(@NotNull CoDScriptParser.PrimaryExpressionGroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#breakpointStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakpointStatement(@NotNull CoDScriptParser.BreakpointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#breakpointStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakpointStatement(@NotNull CoDScriptParser.BreakpointStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueGame}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueGame(@NotNull CoDScriptParser.ContainerValueGameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueGame}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueGame(@NotNull CoDScriptParser.ContainerValueGameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(@NotNull CoDScriptParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(@NotNull CoDScriptParser.ReturnWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpression(@NotNull CoDScriptParser.LessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpression(@NotNull CoDScriptParser.LessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveToMultiplicativeExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveToMultiplicativeExpression(@NotNull CoDScriptParser.AdditiveToMultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveToMultiplicativeExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveToMultiplicativeExpression(@NotNull CoDScriptParser.AdditiveToMultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XorAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterXorAssignment(@NotNull CoDScriptParser.XorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XorAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitXorAssignment(@NotNull CoDScriptParser.XorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(@NotNull CoDScriptParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(@NotNull CoDScriptParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(@NotNull CoDScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(@NotNull CoDScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStarAssignment(@NotNull CoDScriptParser.StarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStarAssignment(@NotNull CoDScriptParser.StarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionStringLiteralConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionStringLiteralConstant(@NotNull CoDScriptParser.PrimaryExpressionStringLiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionStringLiteralConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionStringLiteralConstant(@NotNull CoDScriptParser.PrimaryExpressionStringLiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExclusiveOrExpression(@NotNull CoDScriptParser.TrueExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExclusiveOrExpression(@NotNull CoDScriptParser.TrueExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityToRelationalExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityToRelationalExpression(@NotNull CoDScriptParser.EqualityToRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityToRelationalExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityToRelationalExpression(@NotNull CoDScriptParser.EqualityToRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionVector}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionVector(@NotNull CoDScriptParser.PrimaryExpressionVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionVector}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionVector(@NotNull CoDScriptParser.PrimaryExpressionVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpression(@NotNull CoDScriptParser.NotEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpression(@NotNull CoDScriptParser.NotEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull CoDScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull CoDScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionFloatConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionFloatConstant(@NotNull CoDScriptParser.PrimaryExpressionFloatConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionFloatConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionFloatConstant(@NotNull CoDScriptParser.PrimaryExpressionFloatConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterLeftShiftAssignment(@NotNull CoDScriptParser.LeftShiftAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitLeftShiftAssignment(@NotNull CoDScriptParser.LeftShiftAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#optionallyTerminatedStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionallyTerminatedStatement(@NotNull CoDScriptParser.OptionallyTerminatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#optionallyTerminatedStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionallyTerminatedStatement(@NotNull CoDScriptParser.OptionallyTerminatedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueDotIdentifier(@NotNull CoDScriptParser.ContainerValueDotIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueDotIdentifier(@NotNull CoDScriptParser.ContainerValueDotIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull CoDScriptParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull CoDScriptParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CoDScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CoDScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#usingAnimtreeStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsingAnimtreeStatement(@NotNull CoDScriptParser.UsingAnimtreeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#usingAnimtreeStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsingAnimtreeStatement(@NotNull CoDScriptParser.UsingAnimtreeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrToLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrToLogicalAndExpression(@NotNull CoDScriptParser.LogicalOrToLogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrToLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrToLogicalAndExpression(@NotNull CoDScriptParser.LogicalOrToLogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueFunctionCallArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueFunctionCallArrayAccess(@NotNull CoDScriptParser.LvalueFunctionCallArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueFunctionCallArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueFunctionCallArrayAccess(@NotNull CoDScriptParser.LvalueFunctionCallArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueLogicalAndExpression(@NotNull CoDScriptParser.TrueLogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueLogicalAndExpression(@NotNull CoDScriptParser.TrueLogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueGameArray}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueGameArray(@NotNull CoDScriptParser.LvalueGameArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueGameArray}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueGameArray(@NotNull CoDScriptParser.LvalueGameArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull CoDScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull CoDScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#terminatedStatement}.
	 * @param ctx the parse tree
	 */
	void enterTerminatedStatement(@NotNull CoDScriptParser.TerminatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#terminatedStatement}.
	 * @param ctx the parse tree
	 */
	void exitTerminatedStatement(@NotNull CoDScriptParser.TerminatedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssignment(@NotNull CoDScriptParser.RightShiftAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssignment(@NotNull CoDScriptParser.RightShiftAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAndExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueAndExpression(@NotNull CoDScriptParser.TrueAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAndExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueAndExpression(@NotNull CoDScriptParser.TrueAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterRegularAssignment(@NotNull CoDScriptParser.RegularAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitRegularAssignment(@NotNull CoDScriptParser.RegularAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftExpression(@NotNull CoDScriptParser.RightShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftExpression(@NotNull CoDScriptParser.RightShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(@NotNull CoDScriptParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(@NotNull CoDScriptParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterPlusAssignment(@NotNull CoDScriptParser.PlusAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitPlusAssignment(@NotNull CoDScriptParser.PlusAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDivAssignment(@NotNull CoDScriptParser.DivAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDivAssignment(@NotNull CoDScriptParser.DivAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnWithoutValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithoutValue(@NotNull CoDScriptParser.ReturnWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnWithoutValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithoutValue(@NotNull CoDScriptParser.ReturnWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantCaseInteger}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterConstantCaseInteger(@NotNull CoDScriptParser.ConstantCaseIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantCaseInteger}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitConstantCaseInteger(@NotNull CoDScriptParser.ConstantCaseIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 */
	void enterDynamicFunctionCall(@NotNull CoDScriptParser.DynamicFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 */
	void exitDynamicFunctionCall(@NotNull CoDScriptParser.DynamicFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CoDScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CoDScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueArrayAccess(@NotNull CoDScriptParser.ContainerValueArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueArrayAccess(@NotNull CoDScriptParser.ContainerValueArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#innerDeveloperComment}.
	 * @param ctx the parse tree
	 */
	void enterInnerDeveloperComment(@NotNull CoDScriptParser.InnerDeveloperCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#innerDeveloperComment}.
	 * @param ctx the parse tree
	 */
	void exitInnerDeveloperComment(@NotNull CoDScriptParser.InnerDeveloperCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpression(@NotNull CoDScriptParser.GreaterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpression(@NotNull CoDScriptParser.GreaterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryLogicalNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicalNotExpression(@NotNull CoDScriptParser.UnaryLogicalNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryLogicalNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicalNotExpression(@NotNull CoDScriptParser.UnaryLogicalNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CoDScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CoDScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(@NotNull CoDScriptParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(@NotNull CoDScriptParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#outerDeveloperComment}.
	 * @param ctx the parse tree
	 */
	void enterOuterDeveloperComment(@NotNull CoDScriptParser.OuterDeveloperCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#outerDeveloperComment}.
	 * @param ctx the parse tree
	 */
	void exitOuterDeveloperComment(@NotNull CoDScriptParser.OuterDeveloperCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionFunctionPointerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionFunctionPointerConstant(@NotNull CoDScriptParser.PrimaryExpressionFunctionPointerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionFunctionPointerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionFunctionPointerConstant(@NotNull CoDScriptParser.PrimaryExpressionFunctionPointerConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftToAdditiveExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftToAdditiveExpression(@NotNull CoDScriptParser.ShiftToAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftToAdditiveExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftToAdditiveExpression(@NotNull CoDScriptParser.ShiftToAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeToUnaryExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeToUnaryExpression(@NotNull CoDScriptParser.MultiplicativeToUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeToUnaryExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeToUnaryExpression(@NotNull CoDScriptParser.MultiplicativeToUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionTrueConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionTrueConstant(@NotNull CoDScriptParser.PrimaryExpressionTrueConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionTrueConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionTrueConstant(@NotNull CoDScriptParser.PrimaryExpressionTrueConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndToEqualityExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndToEqualityExpression(@NotNull CoDScriptParser.AndToEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndToEqualityExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndToEqualityExpression(@NotNull CoDScriptParser.AndToEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueInclusiveOrExpression(@NotNull CoDScriptParser.TrueInclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueInclusiveOrExpression(@NotNull CoDScriptParser.TrueInclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueParens}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueParens(@NotNull CoDScriptParser.ContainerValueParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueParens}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueParens(@NotNull CoDScriptParser.ContainerValueParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionAnimtreeConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionAnimtreeConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimtreeConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionAnimtreeConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionAnimtreeConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimtreeConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantCaseString}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterConstantCaseString(@NotNull CoDScriptParser.ConstantCaseStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantCaseString}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitConstantCaseString(@NotNull CoDScriptParser.ConstantCaseStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueSelf}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueSelf(@NotNull CoDScriptParser.ContainerValueSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueSelf}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueSelf(@NotNull CoDScriptParser.ContainerValueSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExpression(@NotNull CoDScriptParser.UnaryNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExpression(@NotNull CoDScriptParser.UnaryNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(@NotNull CoDScriptParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(@NotNull CoDScriptParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#waittillStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaittillStatement(@NotNull CoDScriptParser.WaittillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#waittillStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaittillStatement(@NotNull CoDScriptParser.WaittillStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#waittillframeendStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaittillframeendStatement(@NotNull CoDScriptParser.WaittillframeendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#waittillframeendStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaittillframeendStatement(@NotNull CoDScriptParser.WaittillframeendStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualExpression(@NotNull CoDScriptParser.GreaterEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualExpression(@NotNull CoDScriptParser.GreaterEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 */
	void enterStaticFunctionCall(@NotNull CoDScriptParser.StaticFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 */
	void exitStaticFunctionCall(@NotNull CoDScriptParser.StaticFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(@NotNull CoDScriptParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(@NotNull CoDScriptParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueFunctionCallTailOnly}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueFunctionCallTailOnly(@NotNull CoDScriptParser.ContainerValueFunctionCallTailOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueFunctionCallTailOnly}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueFunctionCallTailOnly(@NotNull CoDScriptParser.ContainerValueFunctionCallTailOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointer(@NotNull CoDScriptParser.FunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#functionPointer}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointer(@NotNull CoDScriptParser.FunctionPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueDotIdentifier(@NotNull CoDScriptParser.LvalueDotIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueDotIdentifier(@NotNull CoDScriptParser.LvalueDotIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueLevel}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueLevel(@NotNull CoDScriptParser.ContainerValueLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueLevel}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueLevel(@NotNull CoDScriptParser.ContainerValueLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull CoDScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull CoDScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerValueFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValueFunctionCall(@NotNull CoDScriptParser.ContainerValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerValueFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValueFunctionCall(@NotNull CoDScriptParser.ContainerValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExclusiveOrToAndExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrToAndExpression(@NotNull CoDScriptParser.ExclusiveOrToAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExclusiveOrToAndExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrToAndExpression(@NotNull CoDScriptParser.ExclusiveOrToAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryToPrimaryExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryToPrimaryExpression(@NotNull CoDScriptParser.UnaryToPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryToPrimaryExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryToPrimaryExpression(@NotNull CoDScriptParser.UnaryToPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvalueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalueIdentifier(@NotNull CoDScriptParser.LvalueIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvalueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalueIdentifier(@NotNull CoDScriptParser.LvalueIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAndAssignment(@NotNull CoDScriptParser.AndAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAndAssignment(@NotNull CoDScriptParser.AndAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLogicalOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueLogicalOrExpression(@NotNull CoDScriptParser.TrueLogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLogicalOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueLogicalOrExpression(@NotNull CoDScriptParser.TrueLogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpressionIntegerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpressionIntegerConstant(@NotNull CoDScriptParser.PrimaryExpressionIntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpressionIntegerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpressionIntegerConstant(@NotNull CoDScriptParser.PrimaryExpressionIntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaitStatement(@NotNull CoDScriptParser.WaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaitStatement(@NotNull CoDScriptParser.WaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStatement(@NotNull CoDScriptParser.NotifyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#notifyStatement}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStatement(@NotNull CoDScriptParser.NotifyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterMinusAssignment(@NotNull CoDScriptParser.MinusAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitMinusAssignment(@NotNull CoDScriptParser.MinusAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndToInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndToInclusiveOrExpression(@NotNull CoDScriptParser.LogicalAndToInclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndToInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndToInclusiveOrExpression(@NotNull CoDScriptParser.LogicalAndToInclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterOrAssignment(@NotNull CoDScriptParser.OrAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitOrAssignment(@NotNull CoDScriptParser.OrAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoDScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(@NotNull CoDScriptParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoDScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(@NotNull CoDScriptParser.FunctionCallStatementContext ctx);
}