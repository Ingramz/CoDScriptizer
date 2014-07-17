import ast.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AstCreationVisitor extends CoDScriptBaseVisitor<AstNode>
{
    @Override
    public AstNode visitFor_loop(@NotNull CoDScriptParser.For_loopContext ctx)
    {
        //System.out.println("visitFor_loop");
        Statement precond = null;
        Expression cond = null;
        Statement postcond = null;
        Statement code = null;

        if(ctx.code_line_req_end(0) != null)
            precond = (Statement)visit(ctx.code_line_req_end(0));

        if(ctx.returnable() != null)
            cond = (Expression)visit(ctx.returnable());

        if(ctx.code_line_req_end(1) != null)
            postcond = (Statement)visit(ctx.code_line_req_end(1));

        if(ctx.code_line() != null)
            code = (Statement)visit(ctx.code_line());

        return new ForLoop(precond, cond, postcond, code);
    }

    @Override
    public AstNode visitFunction_pointer(@NotNull CoDScriptParser.Function_pointerContext ctx)
    {
        //System.out.println("visitFunction_pointer");
        FileLocation fl = null;
        if(ctx.file_path() != null)
            fl = (FileLocation)visit(ctx.file_path());
        return new FunctionPointer(fl, ctx.Identifier().getText());
    }

    @Override
    public AstNode visitStaticFunctionCall(@NotNull CoDScriptParser.StaticFunctionCallContext ctx) {
        //System.out.println("visitStaticFunctionCall");

        List<Expression> args = new ArrayList<Expression>();
        for(int i=0;i<ctx.returnable().size();i++)
            args.add((Expression)visit(ctx.returnable(i)));

        FunctionPointer ptr;
        if(ctx.function_pointer() == null)
            ptr = new FunctionPointer(null, ctx.ptr.getText());
        else
            ptr = (FunctionPointer) visit(ctx.function_pointer());


        return new FunctionCallViaStatic(null, ctx.Thread() != null, ptr, args);
    }

    @Override
    public AstNode visitDynamicFunctionCall(@NotNull CoDScriptParser.DynamicFunctionCallContext ctx) {
        //System.out.println("visitDynamicFunctionCall");
        List<Expression> args = new ArrayList<Expression>();
        for(int i=0;i<ctx.returnable().size();i++)
            if(ctx.returnable(i) != ctx.expr)
                args.add((Expression)visit(ctx.returnable(i)));

        Expression ptr = (Expression)visit(ctx.expr);

        return new FunctionCallViaPointer(null,  ctx.Thread() != null, ptr, args);
    }

    @Override
    public AstNode visitIf_statement(@NotNull CoDScriptParser.If_statementContext ctx)
    {
        //System.out.println("visitIf_statement");
        List<IfStatementBranch> statements = new ArrayList<IfStatementBranch>();
        statements.add((IfStatementBranch)visit(ctx.if_s()));
        for(int i=0;i<ctx.elseif_s().size();i++)
            statements.add((IfStatementBranch)visit(ctx.elseif_s(i)));

        if(ctx.else_s() != null)
            statements.add((IfStatementBranch)visit(ctx.else_s()));

        return new IfStatement(statements);
    }

    @Override
    public AstNode visitIf_s(@NotNull CoDScriptParser.If_sContext ctx)
    {
        //System.out.println("visitIf_s");
        return new IfStatementBranch((Expression)visit(ctx.returnable()), (Statement)visit(ctx.code_line()));
    }

    @Override
    public AstNode visitElseif_s(@NotNull CoDScriptParser.Elseif_sContext ctx) {
        //System.out.println("visitElseif_s");
        return new IfStatementBranch((Expression)visit(ctx.returnable()), (Statement)visit(ctx.code_line()));
    }

    @Override
    public AstNode visitElse_s(@NotNull CoDScriptParser.Else_sContext ctx) {
        //System.out.println("visitElse_s");
        return new IfStatementBranch(null, (Statement)visit(ctx.code_line()));
    }

    @Override
    public AstNode visitCode_block(@NotNull CoDScriptParser.Code_blockContext ctx)
    {
        //System.out.println("visitCode_block");
        List<Statement> statements = new ArrayList<Statement>();
        for(int i=0;i<ctx.code_line().size();i++)
        {
            AstNode an = visit(ctx.code_line(i));
            Statement s = (Statement) an;
            //Statement s = (Statement)visit(ctx.code_line(i));
            statements.add(s);
        }

        return new Block(statements);
    }

    @Override
    public AstNode visitIncrement_decrement(@NotNull CoDScriptParser.Increment_decrementContext ctx)
    {
        if(ctx.op.getType() == CoDScriptLexer.PlusPlus)
            return new IncrementStatement((Expression)visit(ctx.variable()));
        else
            return new DecrementStatement((Expression)visit(ctx.variable()));
    }

    @Override
    public AstNode visitNotify_statement(@NotNull CoDScriptParser.Notify_statementContext ctx) {
        List<Expression> args = new ArrayList<Expression>();
        for(int i=0;i<ctx.returnable().size();i++)
            args.add((Expression)visit(ctx.returnable(i)));

        Expression called_on = null;
        if(ctx.variable() != null)
            called_on = (Expression)visit(ctx.variable());

        return new NotifyStatement(called_on, args);
    }

    @Override
    public AstNode visitVector(@NotNull CoDScriptParser.VectorContext ctx) {
        //System.out.println("visitVector");
        return new Vector((Expression)visit(ctx.returnable(0)), (Expression)visit(ctx.returnable(1)), (Expression)visit(ctx.returnable(2)));
    }

    @Override
    public AstNode visitVar_base(@NotNull CoDScriptParser.Var_baseContext ctx)
    {
        //System.out.println("visitVar_base");
        if(ctx.function_call_2() != null)
            return visit(ctx.function_call_2());
        else if(ctx.Identifier() != null)
            return new Variable(ctx.Identifier().getText());
        else if(ctx.Game() != null)
            return new Variable("game");
        else if(ctx.Level() != null)
            return new Variable("level");
        else if(ctx.Self() != null)
            return new Variable("self");
        else
            return null;
    }

    @Override
    public AstNode visitSwitch_statement(@NotNull CoDScriptParser.Switch_statementContext ctx) {
        //System.out.println("visitSwitch_statement");
        List<SwitchBranch> branches = new ArrayList<SwitchBranch>();
        for(int i=0;i<ctx.case_block().size();i++)
            branches.add((SwitchBranch)visit(ctx.case_block(i)));
        return new SwitchStatement((Expression)visit(ctx.returnable()), branches);
    }

    @Override
    public AstNode visitWhile_loop(@NotNull CoDScriptParser.While_loopContext ctx)
    {
        return new WhileStatement((Expression)visit(ctx.returnable()), (Statement)visit(ctx.code_line()));
    }

    @Override
    public AstNode visitWaittill_statement(@NotNull CoDScriptParser.Waittill_statementContext ctx) {
        //System.out.println("visitWaittill_statement");
        List<Expression> args = new ArrayList<Expression>();
        for(int i=0;i<ctx.returnable().size();i++)
            args.add((Expression)visit(ctx.returnable(i)));

        Expression called_on = null;
        if(ctx.variable() != null)
            called_on = (Expression)visit(ctx.variable());

        return new WaittillStatement(called_on, args);
    }

    @Override
    public AstNode visitFunction_definition(@NotNull CoDScriptParser.Function_definitionContext ctx)
    {
        //System.out.println("visitFunction_definition");
        List<Variable> args = new ArrayList<Variable>();

        for(int i=0;i<ctx.Identifier().size();i++)
            if(ctx.Identifier(i).getSymbol() != ctx.name)
                args.add(new Variable(ctx.Identifier(i).getText()));

        return new FunctionDefinition(ctx.name.getText(), args, (Block)visit(ctx.code_block()));
    }

    @Override
    public AstNode visitInclude_statement(@NotNull CoDScriptParser.Include_statementContext ctx) {
        //System.out.println("visitInclude_statement");
        return new IncludeStatement((FileLocation)visit(ctx.file_path()));
    }

    @Override
    public AstNode visitUsing_animtree_statement(@NotNull CoDScriptParser.Using_animtree_statementContext ctx) {
        //System.out.println("visitUsing_animtree_statement");
        return new UsingAnimtreeStatement(ctx.StringLiteral().getText());
    }

    @Override
    public AstNode visitDeveloper_comment(@NotNull CoDScriptParser.Developer_commentContext ctx)
    {
        //System.out.println("visitDeveloper_comment");
        List<Statement> code = new ArrayList<Statement>();

        for(int i=0;i<ctx.code_line().size();i++)
            code.add((Statement)visit(ctx.code_line(i)));

        return new DeveloperComment(new Block(code));
    }

    @Override
    public AstNode visitFalse(@NotNull CoDScriptParser.FalseContext ctx) {
        //System.out.println("visitFalse");
        return new NumericLiteral(new BigDecimal(0));
    }

    @Override
    public AstNode visitTrue(@NotNull CoDScriptParser.TrueContext ctx) {
        //System.out.println("visitTrue");
        return new NumericLiteral(new BigDecimal(1));
    }

    @Override
    public AstNode visitUndefined(@NotNull CoDScriptParser.UndefinedContext ctx) {
        //System.out.println("visitUndefined");
        return new UndefinedLiteral();
    }

    @Override
    public AstNode visitEmptyArray(@NotNull CoDScriptParser.EmptyArrayContext ctx) {
        //System.out.println("visitEmptyArray");
        return new EmptyArrayLiteral();
    }

    @Override
    public AstNode visitStringLiteral(@NotNull CoDScriptParser.StringLiteralContext ctx) {
        //System.out.println("visitStringLiteral");
        return new StringLiteral(ctx.StringLiteral().getText());
    }

    @Override
    public AstNode visitNumericConstant(@NotNull CoDScriptParser.NumericConstantContext ctx) {
        //System.out.println("visitNumericConstant");
        return new NumericLiteral(new BigDecimal(ctx.NumericConstant().getText()));
    }

    @Override
    public AstNode visitFile_path(@NotNull CoDScriptParser.File_pathContext ctx)
    {
        //System.out.println("visitFile_path");
        String path = "";
        for(int i=0;i<ctx.getChildCount();i++)
        {
            path += ctx.getChild(i).getText();
        }
        return new FileLocation(path);
    }

    @Override
    public AstNode visitCase_block(@NotNull CoDScriptParser.Case_blockContext ctx)
    {
        //System.out.println("visitCase_block");
        List<SwitchCase> sc = new ArrayList<SwitchCase>();
        for(int i=0;i<ctx.case_s().size();i++)
            sc.add((SwitchCase)visit(ctx.case_s(i)));

        List<Statement> code = new ArrayList<Statement>();

        for(int i=0;i<ctx.code_line().size();i++)
            code.add((Statement)visit(ctx.code_line(i)));

        return new SwitchBranch(sc, new Block(code));
    }

    @Override
    public AstNode visitEndon_statement(@NotNull CoDScriptParser.Endon_statementContext ctx) {
        Expression event = (Expression)visit(ctx.returnable());

        Expression called_on = null;
        if(ctx.variable() != null)
            called_on = (Expression)visit(ctx.variable());

        return new EndonStatement(called_on, event);
    }

    @Override
    public AstNode visitLogicalAndExpression(@NotNull CoDScriptParser.LogicalAndExpressionContext ctx)
    {
        //System.out.println("visitLogicalAndExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression)visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "&&"), args);
    }

    @Override
    public AstNode visitDeveloper_comment_func_def(@NotNull CoDScriptParser.Developer_comment_func_defContext ctx)
    {
        //System.out.println("visitDeveloper_comment_func_def");
        List<AstNode> nodes = new ArrayList<AstNode>();

        for(int i=0;i<ctx.function_definition().size();++i)
            nodes.add(visit(ctx.function_definition(i)));

        return new DeveloperCommentProgram(nodes);
    }

    @Override
    public AstNode visitFunction_call_on(@NotNull CoDScriptParser.Function_call_onContext ctx)
    {
        //System.out.println("visitFunction_call_on");
        if(ctx.function_call_2() != null)
        {
            FunctionCall fc = (FunctionCall)visit(ctx.function_call_2());
            fc.setCalledOn((Expression)visit(ctx.function_call_on()));
            return fc;
        } else {
            return visit(ctx.variable());
        }
    }

    @Override
    public AstNode visitLogicalOrExpression(@NotNull CoDScriptParser.LogicalOrExpressionContext ctx) {
        //System.out.println("visitLogicalOrExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression)visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "||"), args);
    }

    @Override
    public AstNode visitAssignment(@NotNull CoDScriptParser.AssignmentContext ctx) {
        //System.out.println("visitAssignment");
        return new Assignment((Expression)visit(ctx.variable()) ,ctx.op.getText(), (Expression)visit(ctx.returnable()));
    }

    @Override
    public AstNode visitProgram(@NotNull CoDScriptParser.ProgramContext ctx) {
        ////System.out.println("visitProgram");
        List<AstNode> nodes = new ArrayList<AstNode>();

        for(int i=0;i<ctx.getChildCount();++i)
            nodes.add(visit(ctx.getChild(i)));

        return new Program(nodes);
    }

    @Override
    public AstNode visitDotAccess(@NotNull CoDScriptParser.DotAccessContext ctx) {
        //System.out.println("visitDotAccess");
        return new StructMember(ctx.Identifier().getText(), (Expression)visit(ctx.variable_ext()));
    }

    @Override
    public AstNode visitArrayAccess(@NotNull CoDScriptParser.ArrayAccessContext ctx) {
        //System.out.println("visitArrayAccess");
        return new ArrayElement((Expression)visit(ctx.variable_ext()), (Expression)visit(ctx.returnable()));
    }

    @Override
    public AstNode visitCode_line(@NotNull CoDScriptParser.Code_lineContext ctx) {
        //System.out.println("visitCode_line");
        AstNode an;
        if(ctx.code_line_req_end() != null)
            an = new SemicolonStatement((Statement)visit(ctx.code_line_req_end()));
        else
            an = visit(ctx.code_line_opt_end());

        if(an == null)
        {
            System.out.println("err");
            System.exit(0);
        }

        return an;
    }

    @Override
    public AstNode visitCode_line_req_end(@NotNull CoDScriptParser.Code_line_req_endContext ctx) {
        //System.out.println("visitCode_line_req_end");
        return super.visitCode_line_req_end(ctx);
    }

    @Override
    public AstNode visitFunction_call(@NotNull CoDScriptParser.Function_callContext ctx) {
        //System.out.println("visitFunction_call");
        FunctionCall fc;
        if(ctx.function_call_2() == null)
            fc = (FunctionCall) visit(ctx.function_call_on());
        else
            fc = (FunctionCall) visit(ctx.function_call_2());
        return fc;
    }

    @Override
    public AstNode visitFunction_call_statement(@NotNull CoDScriptParser.Function_call_statementContext ctx) {
        //System.out.println("visitFunction_call_statement");
        return new FunctionCallStatement((FunctionCall)visit(ctx.function_call()));
    }

    @Override
    public AstNode visitWait_statement(@NotNull CoDScriptParser.Wait_statementContext ctx) {
        //System.out.println("visitWait_statement");
        return new WaitStatement((Expression)visit(ctx.returnable()));
    }

    @Override
    public AstNode visitBitwiseXorExpression(@NotNull CoDScriptParser.BitwiseXorExpressionContext ctx) {
        //System.out.println("visitBitwiseXorExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "^"), args);
    }

    @Override
    public AstNode visitBitwiseAndExpression(@NotNull CoDScriptParser.BitwiseAndExpressionContext ctx) {
        //System.out.println("visitBitwiseAndExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "&"), args);
    }

    @Override
    public AstNode visitValueExpression(@NotNull CoDScriptParser.ValueExpressionContext ctx) {
        //System.out.println("visitValueExpression");
        return super.visitValueExpression(ctx);
    }

    @Override
    public AstNode visitBitwiseNegationExpression(@NotNull CoDScriptParser.BitwiseNegationExpressionContext ctx) {
        //System.out.println("visitBitwiseNegationExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression) visit(ctx.returnable()));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "~"), args);
    }

    @Override
    public AstNode visitValue(@NotNull CoDScriptParser.ValueContext ctx) {
        //System.out.println("visitValue");
        return super.visitValue(ctx);
    }

    @Override
    public AstNode visitLocalizedStringLiteral(@NotNull CoDScriptParser.LocalizedStringLiteralContext ctx) {
        //System.out.println("visitLocalizedStringLiteral");
        return new LocalizedStringLiteral(ctx.StringLiteral().getText());
    }

    @Override
    public AstNode visitComparisonExpression(@NotNull CoDScriptParser.ComparisonExpressionContext ctx) {
        //System.out.println("visitComparisonExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, ctx.op.getText()), args);
    }

    @Override
    public AstNode visitMultiplicationSubtractionExpression(@NotNull CoDScriptParser.MultiplicationSubtractionExpressionContext ctx) {
        //System.out.println("visitMultiplicationSubtractionExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, ctx.op.getText()), args);
    }

    @Override
    public AstNode visitBitwiseOrExpression(@NotNull CoDScriptParser.BitwiseOrExpressionContext ctx) {
        //System.out.println("visitBitwiseOrExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "|"), args);
    }

    @Override
    public AstNode visitAddSubtractExpression(@NotNull CoDScriptParser.AddSubtractExpressionContext ctx) {
        //System.out.println("visitAddSubtractExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, ctx.op.getText()), args);
    }

    @Override
    public AstNode visitLogicalNegationExpression(@NotNull CoDScriptParser.LogicalNegationExpressionContext ctx) {
        //System.out.println("visitLogicalNegationExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression) visit(ctx.returnable()));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, "!"), args);
    }

    @Override
    public AstNode visitCode_line_opt_end(@NotNull CoDScriptParser.Code_line_opt_endContext ctx) {
        //System.out.println("visitCode_line_opt_end");
        return super.visitCode_line_opt_end(ctx);
    }

    @Override
    public AstNode visitFunctionPointer(@NotNull CoDScriptParser.FunctionPointerContext ctx) {
        //System.out.println("visitFunctionPointer");
        return super.visitFunctionPointer(ctx);
    }

    @Override
    public AstNode visitGrouping(@NotNull CoDScriptParser.GroupingContext ctx) {
        //System.out.println("visitGrouping");
        return visit(ctx.returnable());
    }

    @Override
    public AstNode visitBitwiseShiftExpression(@NotNull CoDScriptParser.BitwiseShiftExpressionContext ctx) {
        //System.out.println("visitBitwiseShiftExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, ctx.op.getText()), args);
    }

    @Override
    public AstNode visitEqualityExpression(@NotNull CoDScriptParser.EqualityExpressionContext ctx) {
        //System.out.println("visitEqualityExpression");
        List<Expression> args = new ArrayList<Expression>();
        args.add((Expression)visit(ctx.returnable(0)));
        args.add((Expression) visit(ctx.returnable(1)));
        return new FunctionCallViaStatic(null, false, new FunctionPointer(null, ctx.op.getText()), args);
    }

    @Override
    public AstNode visitVarBaseUnused(@NotNull CoDScriptParser.VarBaseUnusedContext ctx) {
        //System.out.println("visitVarBaseUnused");
        return super.visitVarBaseUnused(ctx);
    }

    @Override
    public AstNode visitVariable(@NotNull CoDScriptParser.VariableContext ctx) {
        //System.out.println("visitVariable");
        return super.visitVariable(ctx);
    }

    @Override
    public AstNode visitWaittillframeend_statement(@NotNull CoDScriptParser.Waittillframeend_statementContext ctx) {
        //System.out.println("visitWaittillframeend_statement");
        return new WaittillframeendStatement();
    }

    @Override
    public AstNode visitBreakpoint_statement(@NotNull CoDScriptParser.Breakpoint_statementContext ctx) {
        //System.out.println("visitBreakpoint_statement");
        return new BreakpointStatement();
    }

    @Override
    public AstNode visitReturn_statement(@NotNull CoDScriptParser.Return_statementContext ctx) {
        //System.out.println("visitReturn_statement");
        Expression rv = null;
        if(ctx.returnable() != null)
            rv = (Expression)visit(ctx.returnable());
        //System.out.println("visitReturn_statement_end");
        return new ReturnStatement(rv);
    }

    @Override
    public AstNode visitContinue_statement(@NotNull CoDScriptParser.Continue_statementContext ctx) {
        //System.out.println("visitContinue_statement");
        return new ContinueStatement();
    }

    @Override
    public AstNode visitBreak_statement(@NotNull CoDScriptParser.Break_statementContext ctx) {
        //System.out.println("visitBreak_statement");
        return new BreakStatement();
    }

    @Override
    public AstNode visitConstantCase(@NotNull CoDScriptParser.ConstantCaseContext ctx) {
        //System.out.println("visitConstantCase");
        return new SwitchConstantCase((Literal)visit(ctx.constant()));
    }

    @Override
    public AstNode visitDefaultCase(@NotNull CoDScriptParser.DefaultCaseContext ctx) {
        //System.out.println("visitDefaultCase");
        return new SwitchDefaultCase();
    }

    @Override
    public AstNode visitAnimtree(@NotNull CoDScriptParser.AnimtreeContext ctx) {
        return new AnimtreeLiteral();
    }

    @Override
    public AstNode visitAnimationConstant(@NotNull CoDScriptParser.AnimationConstantContext ctx) {
        return new AnimationNameLiteral(ctx.animName.getText());
    }
}
