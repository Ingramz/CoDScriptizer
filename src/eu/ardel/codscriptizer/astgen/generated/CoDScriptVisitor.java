package eu.ardel.codscriptizer.astgen.generated;// Generated from C:/Users/Indrek/IdeaProjects/CoDScriptizer/src/eu/ardel/codscriptizer/grammars\CoDScript.g4 by ANTLR 4.4.1-dev
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoDScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoDScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionLocalizedStringConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionLocalizedStringConstant(@NotNull CoDScriptParser.PrimaryExpressionLocalizedStringConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionContainerValue}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionContainerValue(@NotNull CoDScriptParser.PrimaryExpressionContainerValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(@NotNull CoDScriptParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionEmptyArrayConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionEmptyArrayConstant(@NotNull CoDScriptParser.PrimaryExpressionEmptyArrayConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(@NotNull CoDScriptParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueArrayAccess(@NotNull CoDScriptParser.LvalueArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAssignment(@NotNull CoDScriptParser.ModAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(@NotNull CoDScriptParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decrement}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(@NotNull CoDScriptParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatementWithOutElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementWithOutElse(@NotNull CoDScriptParser.IfStatementWithOutElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualExpression(@NotNull CoDScriptParser.LessEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueIdentifier(@NotNull CoDScriptParser.ContainerValueIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Increment}
	 * labeled alternative in {@link CoDScriptParser#incrementDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(@NotNull CoDScriptParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuloExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloExpression(@NotNull CoDScriptParser.ModuloExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(@NotNull CoDScriptParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShiftExpression(@NotNull CoDScriptParser.LeftShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatementWithElse}
	 * labeled alternative in {@link CoDScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementWithElse(@NotNull CoDScriptParser.IfStatementWithElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionUndefinedConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionUndefinedConstant(@NotNull CoDScriptParser.PrimaryExpressionUndefinedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#filePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePath(@NotNull CoDScriptParser.FilePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#endonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndonStatement(@NotNull CoDScriptParser.EndonStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionFalseConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionFalseConstant(@NotNull CoDScriptParser.PrimaryExpressionFalseConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InclusiveOrToExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrToExclusiveOrExpression(@NotNull CoDScriptParser.InclusiveOrToExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionAnimationConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionAnimationConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull CoDScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalToShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalToShiftExpression(@NotNull CoDScriptParser.RelationalToShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(@NotNull CoDScriptParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull CoDScriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionGrouping}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionGrouping(@NotNull CoDScriptParser.PrimaryExpressionGroupingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#breakpointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakpointStatement(@NotNull CoDScriptParser.BreakpointStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueGame}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueGame(@NotNull CoDScriptParser.ContainerValueGameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnWithValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithValue(@NotNull CoDScriptParser.ReturnWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpression(@NotNull CoDScriptParser.LessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveToMultiplicativeExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveToMultiplicativeExpression(@NotNull CoDScriptParser.AdditiveToMultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorAssignment(@NotNull CoDScriptParser.XorAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(@NotNull CoDScriptParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link CoDScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(@NotNull CoDScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAssignment(@NotNull CoDScriptParser.StarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionStringLiteralConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionStringLiteralConstant(@NotNull CoDScriptParser.PrimaryExpressionStringLiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExclusiveOrExpression(@NotNull CoDScriptParser.TrueExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityToRelationalExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityToRelationalExpression(@NotNull CoDScriptParser.EqualityToRelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionVector}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionVector(@NotNull CoDScriptParser.PrimaryExpressionVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpression(@NotNull CoDScriptParser.NotEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull CoDScriptParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionFloatConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionFloatConstant(@NotNull CoDScriptParser.PrimaryExpressionFloatConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShiftAssignment(@NotNull CoDScriptParser.LeftShiftAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#optionallyTerminatedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionallyTerminatedStatement(@NotNull CoDScriptParser.OptionallyTerminatedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueDotIdentifier(@NotNull CoDScriptParser.ContainerValueDotIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(@NotNull CoDScriptParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CoDScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#usingAnimtreeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingAnimtreeStatement(@NotNull CoDScriptParser.UsingAnimtreeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrToLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrToLogicalAndExpression(@NotNull CoDScriptParser.LogicalOrToLogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueFunctionCallArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueFunctionCallArrayAccess(@NotNull CoDScriptParser.LvalueFunctionCallArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLogicalAndExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLogicalAndExpression(@NotNull CoDScriptParser.TrueLogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueGameArray}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueGameArray(@NotNull CoDScriptParser.LvalueGameArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull CoDScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#terminatedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminatedStatement(@NotNull CoDScriptParser.TerminatedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightShiftAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftAssignment(@NotNull CoDScriptParser.RightShiftAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueAndExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAndExpression(@NotNull CoDScriptParser.TrueAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularAssignment(@NotNull CoDScriptParser.RegularAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightShiftExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftExpression(@NotNull CoDScriptParser.RightShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(@NotNull CoDScriptParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAssignment(@NotNull CoDScriptParser.PlusAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAssignment(@NotNull CoDScriptParser.DivAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnWithoutValue}
	 * labeled alternative in {@link CoDScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnWithoutValue(@NotNull CoDScriptParser.ReturnWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantCaseInteger}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantCaseInteger(@NotNull CoDScriptParser.ConstantCaseIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DynamicFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicFunctionCall(@NotNull CoDScriptParser.DynamicFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull CoDScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueArrayAccess}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueArrayAccess(@NotNull CoDScriptParser.ContainerValueArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#innerDeveloperComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerDeveloperComment(@NotNull CoDScriptParser.InnerDeveloperCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpression(@NotNull CoDScriptParser.GreaterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryLogicalNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalNotExpression(@NotNull CoDScriptParser.UnaryLogicalNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull CoDScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultCase}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(@NotNull CoDScriptParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#outerDeveloperComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterDeveloperComment(@NotNull CoDScriptParser.OuterDeveloperCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionFunctionPointerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionFunctionPointerConstant(@NotNull CoDScriptParser.PrimaryExpressionFunctionPointerConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftToAdditiveExpression}
	 * labeled alternative in {@link CoDScriptParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftToAdditiveExpression(@NotNull CoDScriptParser.ShiftToAdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeToUnaryExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeToUnaryExpression(@NotNull CoDScriptParser.MultiplicativeToUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionTrueConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionTrueConstant(@NotNull CoDScriptParser.PrimaryExpressionTrueConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndToEqualityExpression}
	 * labeled alternative in {@link CoDScriptParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndToEqualityExpression(@NotNull CoDScriptParser.AndToEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueInclusiveOrExpression(@NotNull CoDScriptParser.TrueInclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueParens}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueParens(@NotNull CoDScriptParser.ContainerValueParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionAnimtreeConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionAnimtreeConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimtreeConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantCaseString}
	 * labeled alternative in {@link CoDScriptParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantCaseString(@NotNull CoDScriptParser.ConstantCaseStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueSelf}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueSelf(@NotNull CoDScriptParser.ContainerValueSelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryNotExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotExpression(@NotNull CoDScriptParser.UnaryNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(@NotNull CoDScriptParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#waittillStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaittillStatement(@NotNull CoDScriptParser.WaittillStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#waittillframeendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaittillframeendStatement(@NotNull CoDScriptParser.WaittillframeendStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqualExpression}
	 * labeled alternative in {@link CoDScriptParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualExpression(@NotNull CoDScriptParser.GreaterEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#functionCallTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticFunctionCall(@NotNull CoDScriptParser.StaticFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link CoDScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(@NotNull CoDScriptParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueFunctionCallTailOnly}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueFunctionCallTailOnly(@NotNull CoDScriptParser.ContainerValueFunctionCallTailOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#functionPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPointer(@NotNull CoDScriptParser.FunctionPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueDotIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueDotIdentifier(@NotNull CoDScriptParser.LvalueDotIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueLevel}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueLevel(@NotNull CoDScriptParser.ContainerValueLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull CoDScriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerValueFunctionCall}
	 * labeled alternative in {@link CoDScriptParser#containerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerValueFunctionCall(@NotNull CoDScriptParser.ContainerValueFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExclusiveOrToAndExpression}
	 * labeled alternative in {@link CoDScriptParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrToAndExpression(@NotNull CoDScriptParser.ExclusiveOrToAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryToPrimaryExpression}
	 * labeled alternative in {@link CoDScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryToPrimaryExpression(@NotNull CoDScriptParser.UnaryToPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvalueIdentifier}
	 * labeled alternative in {@link CoDScriptParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueIdentifier(@NotNull CoDScriptParser.LvalueIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAssignment(@NotNull CoDScriptParser.AndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLogicalOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLogicalOrExpression(@NotNull CoDScriptParser.TrueLogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpressionIntegerConstant}
	 * labeled alternative in {@link CoDScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpressionIntegerConstant(@NotNull CoDScriptParser.PrimaryExpressionIntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#waitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStatement(@NotNull CoDScriptParser.WaitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#notifyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStatement(@NotNull CoDScriptParser.NotifyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAssignment(@NotNull CoDScriptParser.MinusAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndToInclusiveOrExpression}
	 * labeled alternative in {@link CoDScriptParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndToInclusiveOrExpression(@NotNull CoDScriptParser.LogicalAndToInclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrAssignment}
	 * labeled alternative in {@link CoDScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAssignment(@NotNull CoDScriptParser.OrAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoDScriptParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(@NotNull CoDScriptParser.FunctionCallStatementContext ctx);
}