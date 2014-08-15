package eu.ardel.codscriptizer.astgen;

import eu.ardel.codscriptizer.ast.*;
import eu.ardel.codscriptizer.astgen.generated.CoDScriptBaseVisitor;
import eu.ardel.codscriptizer.astgen.generated.CoDScriptParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AstGeneratorVisitor extends CoDScriptBaseVisitor<AstNode> {
    @Override
    public AstNode visitPrimaryExpressionLocalizedStringConstant(@NotNull CoDScriptParser.PrimaryExpressionLocalizedStringConstantContext ctx) {
        return new LocalizedStringLiteral(Utils.stripOutermostQuotes(ctx.StringLiteral().getText()));
    }
/*
    @Override
    public AstNode visitPrimaryExpressionContainerValue(@NotNull CoDScriptParser.PrimaryExpressionContainerValueContext ctx) {
        return super.visitPrimaryExpressionContainerValue(ctx);
    }
*/
    @Override
    public AstNode visitAdditionExpression(@NotNull CoDScriptParser.AdditionExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpression());
        Expression right = (Expression) visit(ctx.multiplicativeExpression());
        return new AdditionOperation(left, right);
    }

    @Override
    public AstNode visitPrimaryExpressionEmptyArrayConstant(@NotNull CoDScriptParser.PrimaryExpressionEmptyArrayConstantContext ctx) {
        return new EmptyArrayLiteral();
    }

    @Override
    public AstNode visitCodeBlock(@NotNull CoDScriptParser.CodeBlockContext ctx) {
        List<Statement> statements = new ArrayList<Statement>();
        for(CoDScriptParser.StatementContext c : ctx.statement())
        {
            Statement s = (Statement)visit(c);
            if(!(s instanceof EmptyStatement))
                statements.add(s);
        }
        return new Block(statements);
    }

    @Override
    public AstNode visitLvalueArrayAccess(@NotNull CoDScriptParser.LvalueArrayAccessContext ctx) {
        return new ArrayElement((Expression) visit(ctx.lvalue()), (Expression) visit(ctx.expression()));
    }

    @Override
    public AstNode visitModAssignment(@NotNull CoDScriptParser.ModAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new ModuloOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitEqualExpression(@NotNull CoDScriptParser.EqualExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.equalityExpression());
        Expression right = (Expression) visit(ctx.relationalExpression());
        return new EqualOperation(left, right);
    }

    @Override
    public AstNode visitDecrement(@NotNull CoDScriptParser.DecrementContext ctx) {
        return new DecrementStatement((Expression)visit(ctx.lvalue()));
    }

    @Override
    public AstNode visitLessEqualExpression(@NotNull CoDScriptParser.LessEqualExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.relationalExpression());
        Expression right = (Expression) visit(ctx.shiftExpression());
        return new LessEqualOperation(left, right);
    }

    @Override
    public AstNode visitContainerValueIdentifier(@NotNull CoDScriptParser.ContainerValueIdentifierContext ctx) {
        return new Variable(ctx.Identifier().getText());
    }

    @Override
    public AstNode visitIncrement(@NotNull CoDScriptParser.IncrementContext ctx) {
        return new IncrementStatement((Expression)visit(ctx.lvalue()));
    }

    @Override
    public AstNode visitModuloExpression(@NotNull CoDScriptParser.ModuloExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression());
        Expression right = (Expression) visit(ctx.unaryExpression());
        return new ModuloOperation(left, right);
    }

    @Override
    public AstNode visitForLoop(@NotNull CoDScriptParser.ForLoopContext ctx) {
        Statement precondition = (Statement)visit(ctx.precond);
        Expression condition = (Expression)visit(ctx.expression());
        Statement postcondition = (Statement)visit(ctx.postcond);
        Statement code = (Statement)visit(ctx.statement());
        return new ForLoop(precondition, condition, postcondition, code);
    }

    @Override
    public AstNode visitLeftShiftExpression(@NotNull CoDScriptParser.LeftShiftExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.shiftExpression());
        Expression right = (Expression) visit(ctx.additiveExpression());
        return new LeftShiftOperation(left, right);
    }

    @Override
    public AstNode visitPrimaryExpressionUndefinedConstant(@NotNull CoDScriptParser.PrimaryExpressionUndefinedConstantContext ctx) {
        return new UndefinedLiteral();
    }

    @Override
    public AstNode visitFilePath(@NotNull CoDScriptParser.FilePathContext ctx) {
        return new FileLocation(ctx.getText());
    }

    @Override
    public AstNode visitEndonStatement(@NotNull CoDScriptParser.EndonStatementContext ctx) {
        return new EndonStatement((Expression)visit(ctx.containerValue()), (Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitPrimaryExpressionFalseConstant(@NotNull CoDScriptParser.PrimaryExpressionFalseConstantContext ctx) {
        return new NumericLiteral(new BigDecimal(0));
    }
/*
    @Override
    public AstNode visitInclusiveOrToExclusiveOrExpression(@NotNull CoDScriptParser.InclusiveOrToExclusiveOrExpressionContext ctx) {
        return super.visitInclusiveOrToExclusiveOrExpression(ctx);
    }
*/
    @Override
    public AstNode visitPrimaryExpressionAnimationConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimationConstantContext ctx) {
        return new AnimationNameLiteral(ctx.Identifier().getText());
    }

    @Override
    public AstNode visitFunctionDefinition(@NotNull CoDScriptParser.FunctionDefinitionContext ctx) {
        List<Variable> params = new ArrayList<Variable>();
        for(TerminalNode tn : ctx.Identifier())
            if(tn != ctx.name)
                params.add(new Variable(tn.getText()));

        Block code = (Block) visit(ctx.codeBlock());
        return new FunctionDefinition(new FunctionPointer(null, ctx.name.getText()), params, code);
    }
/*
    @Override
    public AstNode visitRelationalToShiftExpression(@NotNull CoDScriptParser.RelationalToShiftExpressionContext ctx) {
        return super.visitRelationalToShiftExpression(ctx);
    }
*/
    @Override
    public AstNode visitCaseBlock(@NotNull CoDScriptParser.CaseBlockContext ctx) {
        List<SwitchCase> cases = new ArrayList<SwitchCase>();
        for(CoDScriptParser.SwitchCaseContext swc : ctx.switchCase())
            cases.add((SwitchCase)visit(swc));

        List<Statement> statements = new ArrayList<Statement>();
        for(CoDScriptParser.StatementContext c : ctx.statement())
        {
            Statement s = (Statement)visit(c);
            if(!(s instanceof EmptyStatement))
                statements.add(s);
        }

        return new SwitchBranch(cases, new Block(statements));
    }

    @Override
    public AstNode visitBreakStatement(@NotNull CoDScriptParser.BreakStatementContext ctx) {
        return new BreakStatement();
    }

    @Override
    public AstNode visitPrimaryExpressionGrouping(@NotNull CoDScriptParser.PrimaryExpressionGroupingContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AstNode visitBreakpointStatement(@NotNull CoDScriptParser.BreakpointStatementContext ctx) {
        return new BreakpointStatement();
    }

    @Override
    public AstNode visitContainerValueGame(@NotNull CoDScriptParser.ContainerValueGameContext ctx) {
        return new Variable("game");
    }

    @Override
    public AstNode visitLessExpression(@NotNull CoDScriptParser.LessExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.shiftExpression());
        Expression right = (Expression) visit(ctx.relationalExpression());
        return new LessOperation(left, right);
    }
/*
    @Override
    public AstNode visitAdditiveToMultiplicativeExpression(@NotNull CoDScriptParser.AdditiveToMultiplicativeExpressionContext ctx) {
        return super.visitAdditiveToMultiplicativeExpression(ctx);
    }
*/
    @Override
    public AstNode visitXorAssignment(@NotNull CoDScriptParser.XorAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new ExclusiveOrOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitIncludeStatement(@NotNull CoDScriptParser.IncludeStatementContext ctx) {
        return new IncludeStatement((FileLocation)visit(ctx.filePath()));
    }

    @Override
    public AstNode visitSubtractionExpression(@NotNull CoDScriptParser.SubtractionExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression());
        Expression right = (Expression) visit(ctx.additiveExpression());
        return new SubtractionOperation(left, right);
    }

    @Override
    public AstNode visitStarAssignment(@NotNull CoDScriptParser.StarAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new MultiplicationOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitPrimaryExpressionStringLiteralConstant(@NotNull CoDScriptParser.PrimaryExpressionStringLiteralConstantContext ctx) {
        return new StringLiteral(Utils.stripOutermostQuotes(ctx.StringLiteral().getText()));
    }

    @Override
    public AstNode visitTrueExclusiveOrExpression(@NotNull CoDScriptParser.TrueExclusiveOrExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.exclusiveOrExpression());
        Expression right = (Expression) visit(ctx.andExpression());
        return new ExclusiveOrOperation(left, right);
    }
/*
    @Override
    public AstNode visitEqualityToRelationalExpression(@NotNull CoDScriptParser.EqualityToRelationalExpressionContext ctx) {
        return super.visitEqualityToRelationalExpression(ctx);
    }
*/

/*
    @Override
    public AstNode visitPrimaryExpressionVector(@NotNull CoDScriptParser.PrimaryExpressionVectorContext ctx) {
        return super.visitPrimaryExpressionVector(ctx);
    }
*/

    @Override
    public AstNode visitNotEqualExpression(@NotNull CoDScriptParser.NotEqualExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.equalityExpression());
        Expression right = (Expression) visit(ctx.relationalExpression());
        return new NotEqualOperation(left, right);
    }

    @Override
    public AstNode visitSwitchStatement(@NotNull CoDScriptParser.SwitchStatementContext ctx) {
        List<SwitchBranch> branches = new ArrayList<SwitchBranch>();
        for(CoDScriptParser.CaseBlockContext cbc : ctx.caseBlock())
            branches.add((SwitchBranch)visit(cbc));

        return new SwitchStatement((Expression)visit(ctx.expression()), branches);
    }

    @Override
    public AstNode visitPrimaryExpressionFloatConstant(@NotNull CoDScriptParser.PrimaryExpressionFloatConstantContext ctx) {
        return new NumericLiteral(new BigDecimal(ctx.getText()));
    }

    @Override
    public AstNode visitLeftShiftAssignment(@NotNull CoDScriptParser.LeftShiftAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new LeftShiftOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }
/*
    @Override
    public AstNode visitOptionallyTerminatedStatement(@NotNull CoDScriptParser.OptionallyTerminatedStatementContext ctx) {
        return super.visitOptionallyTerminatedStatement(ctx);
    }
*/

    @Override
    public AstNode visitContainerValueDotIdentifier(@NotNull CoDScriptParser.ContainerValueDotIdentifierContext ctx) {
        return new StructMember((Expression)visit(ctx.containerValue()), ctx.Identifier().getText());
    }

    @Override
    public AstNode visitWhileLoop(@NotNull CoDScriptParser.WhileLoopContext ctx) {
        return new WhileLoop((Expression)visit(ctx.expression()), (Statement)visit(ctx.statement()));
    }
/*
    @Override
    public AstNode visitExpression(@NotNull CoDScriptParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }
*/
    @Override
    public AstNode visitUsingAnimtreeStatement(@NotNull CoDScriptParser.UsingAnimtreeStatementContext ctx) {
        return new UsingAnimtreeStatement(Utils.stripOutermostQuotes(ctx.StringLiteral().getText()));
    }
/*
    @Override
    public AstNode visitLogicalOrToLogicalAndExpression(@NotNull CoDScriptParser.LogicalOrToLogicalAndExpressionContext ctx) {
        return super.visitLogicalOrToLogicalAndExpression(ctx);
    }
*/
    @Override
    public AstNode visitLvalueFunctionCallArrayAccess(@NotNull CoDScriptParser.LvalueFunctionCallArrayAccessContext ctx) {
        return new ArrayElement((Expression)visit(ctx.functionCall()), (Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitReturnWithValue(@NotNull CoDScriptParser.ReturnWithValueContext ctx) {
        return new ReturnStatement((Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitReturnWithoutValue(@NotNull CoDScriptParser.ReturnWithoutValueContext ctx) {
        return new ReturnStatement(null);
    }

    @Override
    public AstNode visitTrueLogicalAndExpression(@NotNull CoDScriptParser.TrueLogicalAndExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.logicalAndExpression());
        Expression right = (Expression) visit(ctx.inclusiveOrExpression());
        return new LogicalAndOperation(left, right);
    }

    @Override
    public AstNode visitLvalueGameArray(@NotNull CoDScriptParser.LvalueGameArrayContext ctx) {
        return new ArrayElement(new Variable("game"), (Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitFunctionCall(@NotNull CoDScriptParser.FunctionCallContext ctx) {
        FunctionCall fc = (FunctionCall) visit(ctx.functionCallTail());
        if(ctx.containerValue() != null)
        {
            Expression ent = (Expression) visit(ctx.containerValue());
            fc.setCalledOn(ent);
        }
        return fc;
    }
/*
    @Override
    public AstNode visitTerminatedStatement(@NotNull CoDScriptParser.TerminatedStatementContext ctx) {
        return super.visitTerminatedStatement(ctx);
    }
*/
    @Override
    public AstNode visitRightShiftAssignment(@NotNull CoDScriptParser.RightShiftAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new RightShiftOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitTrueAndExpression(@NotNull CoDScriptParser.TrueAndExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.andExpression());
        Expression right = (Expression) visit(ctx.equalityExpression());
        return new AndOperation(left, right);
    }

    @Override
    public AstNode visitRegularAssignment(@NotNull CoDScriptParser.RegularAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression rvalue = (Expression)visit(ctx.expression());
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitRightShiftExpression(@NotNull CoDScriptParser.RightShiftExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.shiftExpression());
        Expression right = (Expression) visit(ctx.additiveExpression());
        return new RightShiftOperation(left, right);
    }

    @Override
    public AstNode visitMultiplicationExpression(@NotNull CoDScriptParser.MultiplicationExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression());
        Expression right = (Expression) visit(ctx.unaryExpression());
        return new MultiplicationOperation(left, right);
    }

    @Override
    public AstNode visitPlusAssignment(@NotNull CoDScriptParser.PlusAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new AdditionOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitDivAssignment(@NotNull CoDScriptParser.DivAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new DivisionOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitConstantCaseInteger(@NotNull CoDScriptParser.ConstantCaseIntegerContext ctx) {
        return new NumericLiteral(new BigDecimal(ctx.getText()));
    }

    @Override
    public AstNode visitDynamicFunctionCall(@NotNull CoDScriptParser.DynamicFunctionCallContext ctx) {
        List<Expression> args = new ArrayList<Expression>();
        for(CoDScriptParser.ExpressionContext ec : ctx.expression())
            if(ec != ctx.expr)
                args.add((Expression)visit(ec));

        return new FunctionCallViaExpression(args, ctx.Thread() != null, null, (Expression)visit(ctx.expr));
    }
/*
    @Override
    public AstNode visitStatement(@NotNull CoDScriptParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }
*/
    @Override
    public AstNode visitContainerValueArrayAccess(@NotNull CoDScriptParser.ContainerValueArrayAccessContext ctx) {
        return new ArrayElement((Expression)visit(ctx.containerValue()), (Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitInnerDeveloperComment(@NotNull CoDScriptParser.InnerDeveloperCommentContext ctx) {
        List<Statement> statements = new ArrayList<Statement>();
        for(CoDScriptParser.StatementContext c : ctx.statement())
        {
            Statement s = (Statement)visit(c);
            if(!(s instanceof EmptyStatement))
                statements.add(s);
        }

        return new InnerDeveloperComment(new Block(statements));
    }

    @Override
    public AstNode visitGreaterExpression(@NotNull CoDScriptParser.GreaterExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.relationalExpression());
        Expression right = (Expression) visit(ctx.shiftExpression());
        return new GreaterOperation(left, right);
    }

    @Override
    public AstNode visitUnaryLogicalNotExpression(@NotNull CoDScriptParser.UnaryLogicalNotExpressionContext ctx) {
        return new LogicalNotOperation((Expression) visit(ctx.unaryExpression()));
    }

    @Override
    public AstNode visitProgram(@NotNull CoDScriptParser.ProgramContext ctx) {
        List<AstNode> nodes = new ArrayList<AstNode>();

        for(int i=0;i<ctx.getChildCount();++i)
            nodes.add(visit(ctx.getChild(i)));

        return new Program(nodes);
    }

    @Override
    public AstNode visitDefaultCase(@NotNull CoDScriptParser.DefaultCaseContext ctx) {
        return new SwitchDefaultCase();
    }

    @Override
    public AstNode visitOuterDeveloperComment(@NotNull CoDScriptParser.OuterDeveloperCommentContext ctx) {
        List<FunctionDefinition> definitions = new ArrayList<FunctionDefinition>();
        for(CoDScriptParser.FunctionDefinitionContext c : ctx.functionDefinition())
            definitions.add((FunctionDefinition)visit(c));
         return new OuterDeveloperComment(definitions);
    }
/*
    @Override
    public AstNode visitPrimaryExpressionFunctionPointerConstant(@NotNull CoDScriptParser.PrimaryExpressionFunctionPointerConstantContext ctx) {
        return super.visitPrimaryExpressionFunctionPointerConstant(ctx);
    }
*/
/*
    @Override
    public AstNode visitShiftToAdditiveExpression(@NotNull CoDScriptParser.ShiftToAdditiveExpressionContext ctx) {
         return super.visitShiftToAdditiveExpression(ctx);
    }
*/
/*
    @Override
    public AstNode visitMultiplicativeToUnaryExpression(@NotNull CoDScriptParser.MultiplicativeToUnaryExpressionContext ctx) {
        return super.visitMultiplicativeToUnaryExpression(ctx);
    }
*/
    @Override
    public AstNode visitPrimaryExpressionTrueConstant(@NotNull CoDScriptParser.PrimaryExpressionTrueConstantContext ctx) {
        return new NumericLiteral(new BigDecimal(1));
    }
/*
    @Override
    public AstNode visitAndToEqualityExpression(@NotNull CoDScriptParser.AndToEqualityExpressionContext ctx) {
        return super.visitAndToEqualityExpression(ctx);
    }
*/
    @Override
    public AstNode visitTrueInclusiveOrExpression(@NotNull CoDScriptParser.TrueInclusiveOrExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.inclusiveOrExpression());
        Expression right = (Expression) visit(ctx.exclusiveOrExpression());
        return new InclusiveOrOperation(left, right);
    }

    @Override
    public AstNode visitContainerValueParens(@NotNull CoDScriptParser.ContainerValueParensContext ctx) {
        return visit(ctx.containerValue());
    }

    @Override
    public AstNode visitPrimaryExpressionAnimtreeConstant(@NotNull CoDScriptParser.PrimaryExpressionAnimtreeConstantContext ctx) {
        return new AnimtreeLiteral();
    }

    @Override
    public AstNode visitConstantCaseString(@NotNull CoDScriptParser.ConstantCaseStringContext ctx) {
        return new StringLiteral(Utils.stripOutermostQuotes(ctx.getText()));
    }

    @Override
    public AstNode visitContainerValueSelf(@NotNull CoDScriptParser.ContainerValueSelfContext ctx) {
        return new Variable("self");
    }

    @Override
    public AstNode visitUnaryNotExpression(@NotNull CoDScriptParser.UnaryNotExpressionContext ctx) {
        return new NotOperation((Expression)visit(ctx.unaryExpression()));
    }

    @Override
    public AstNode visitWaittillStatement(@NotNull CoDScriptParser.WaittillStatementContext ctx) {
        List<Expression> arguments = new ArrayList<Expression>();
        for(CoDScriptParser.LvalueContext lvc : ctx.lvalue())
            arguments.add((Expression)visit(lvc));
        return new WaittillStatement((Expression)visit(ctx.containerValue()), (Expression)visit(ctx.expression()), arguments);
    }

    @Override
    public AstNode visitVector(@NotNull CoDScriptParser.VectorContext ctx) {
        return new Vector((Expression)visit(ctx.x), (Expression)visit(ctx.y), (Expression)visit(ctx.z));
    }

    @Override
    public AstNode visitWaittillframeendStatement(@NotNull CoDScriptParser.WaittillframeendStatementContext ctx) {
        return new WaittillframeendStatement();
    }

    @Override
    public AstNode visitGreaterEqualExpression(@NotNull CoDScriptParser.GreaterEqualExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.relationalExpression());
        Expression right = (Expression) visit(ctx.shiftExpression());
        return new GreaterEqualOperation(left, right);
    }

    @Override
    public AstNode visitStaticFunctionCall(@NotNull CoDScriptParser.StaticFunctionCallContext ctx) {
        FunctionPointer fp;
        if(ctx.functionPointer() != null)
            fp = (FunctionPointer)visit(ctx.functionPointer());
        else
            fp = new FunctionPointer(null, ctx.Identifier().getText());

        List<Expression> args = new ArrayList<Expression>();
        for(CoDScriptParser.ExpressionContext ec : ctx.expression())
            args.add((Expression)visit(ec));

        return new FunctionCallViaPointer(args, ctx.Thread() != null, null, fp);
    }

    @Override
    public AstNode visitDivisionExpression(@NotNull CoDScriptParser.DivisionExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression());
        Expression right = (Expression) visit(ctx.unaryExpression());
        return new DivisionOperation(left, right);
    }
/*
    @Override
    public AstNode visitContainerValueFunctionCallTailOnly(@NotNull CoDScriptParser.ContainerValueFunctionCallTailOnlyContext ctx) {
        return super.visitContainerValueFunctionCallTailOnly(ctx);
    }
*/
    @Override
    public AstNode visitFunctionPointer(@NotNull CoDScriptParser.FunctionPointerContext ctx) {
        return new FunctionPointer((FileLocation)visit(ctx.filePath()), ctx.Identifier().getText());
    }

    @Override
    public AstNode visitLvalueDotIdentifier(@NotNull CoDScriptParser.LvalueDotIdentifierContext ctx) {
        return new StructMember((Expression)visit(ctx.containerValue()), ctx.Identifier().getText());
    }

    @Override
    public AstNode visitContainerValueLevel(@NotNull CoDScriptParser.ContainerValueLevelContext ctx) {
        return new Variable("level");
    }

    @Override
    public AstNode visitContinueStatement(@NotNull CoDScriptParser.ContinueStatementContext ctx) {
        return new ContinueStatement();
    }

    @Override
    public AstNode visitContainerValueFunctionCall(@NotNull CoDScriptParser.ContainerValueFunctionCallContext ctx) {
        FunctionCall fc = (FunctionCall)visit(ctx.functionCallTail());
        fc.setCalledOn((Expression)visit(ctx.containerValue()));
        return fc;
    }
/*
    @Override
    public AstNode visitExclusiveOrToAndExpression(@NotNull CoDScriptParser.ExclusiveOrToAndExpressionContext ctx) {
        return super.visitExclusiveOrToAndExpression(ctx);
    }

    @Override
    public AstNode visitUnaryToPrimaryExpression(@NotNull CoDScriptParser.UnaryToPrimaryExpressionContext ctx) {
        return super.visitUnaryToPrimaryExpression(ctx);
    }
*/
    @Override
    public AstNode visitLvalueIdentifier(@NotNull CoDScriptParser.LvalueIdentifierContext ctx) {
        return new Variable(ctx.Identifier().getText());
    }

    @Override
    public AstNode visitIfStatementWithElse(@NotNull CoDScriptParser.IfStatementWithElseContext ctx) {
        return new IfStatement((Expression)visit(ctx.expression()), (Statement)visit(ctx.ifpart), (Statement)visit(ctx.elsepart));
    }

    @Override
    public AstNode visitIfStatementWithOutElse(@NotNull CoDScriptParser.IfStatementWithOutElseContext ctx) {
        return new IfStatement((Expression)visit(ctx.expression()), (Statement)visit(ctx.statement()), null);
    }

    @Override
    public AstNode visitAndAssignment(@NotNull CoDScriptParser.AndAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new AndOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitTrueLogicalOrExpression(@NotNull CoDScriptParser.TrueLogicalOrExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.logicalOrExpression());
        Expression right = (Expression) visit(ctx.logicalAndExpression());
        return new LogicalOrOperation(left, right);
    }

    @Override
    public AstNode visitPrimaryExpressionIntegerConstant(@NotNull CoDScriptParser.PrimaryExpressionIntegerConstantContext ctx) {
        return new NumericLiteral(new BigDecimal(ctx.getText()));
    }

    @Override
    public AstNode visitWaitStatement(@NotNull CoDScriptParser.WaitStatementContext ctx) {
        return new WaitStatement((Expression)visit(ctx.expression()));
    }

    @Override
    public AstNode visitNotifyStatement(@NotNull CoDScriptParser.NotifyStatementContext ctx) {
        List<Expression> arguments = new ArrayList<Expression>();
        for(CoDScriptParser.ExpressionContext ec : ctx.expression())
            arguments.add((Expression)visit(ec));
        return new NotifyStatement((Expression)visit(ctx.containerValue()), arguments);
    }

    @Override
    public AstNode visitMinusAssignment(@NotNull CoDScriptParser.MinusAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new SubtractionOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }
/*
    @Override
    public AstNode visitLogicalAndToInclusiveOrExpression(@NotNull CoDScriptParser.LogicalAndToInclusiveOrExpressionContext ctx) {
        return super.visitLogicalAndToInclusiveOrExpression(ctx);
    }
*/
    @Override
    public AstNode visitOrAssignment(@NotNull CoDScriptParser.OrAssignmentContext ctx) {
        Expression lvalue = (Expression)visit(ctx.lvalue());
        Expression expression = (Expression)visit(ctx.expression());
        Expression rvalue = new InclusiveOrOperation((Expression)Utils.objectCloner(lvalue), expression);
        return new Assignment(lvalue, rvalue);
    }

    @Override
    public AstNode visitFunctionCallStatement(@NotNull CoDScriptParser.FunctionCallStatementContext ctx) {
        return new FunctionCallStatement((FunctionCall)visit(ctx.functionCall()));
    }
}
