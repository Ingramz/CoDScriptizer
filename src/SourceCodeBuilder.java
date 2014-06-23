import ast.*;

import java.util.List;

public class SourceCodeBuilder
{
    static String rebuild(Program an)
    {
        return rebuild_helper(an);
    }

    private static String rebuild_helper(AstNode an)
    {
        if(an instanceof Program) {
            Program prog = (Program) an;
            String p = "";
            for (AstNode n : prog.elements)
                p = concat(p, rebuild_helper(n));
            return p;
        } else if(an instanceof FunctionDefinition) {
            FunctionDefinition fd = (FunctionDefinition) an;
            String p = fd.name;
            p = concat(p, "(");
            boolean first = true;
            for(Variable s : fd.args)
            {
                if(first)
                    first = false;
                else
                    p = concat(p, ",");
                p = concat(p, s.getName());
            }
            p = concat(p, ")");
            p = concat(p, rebuild_helper(fd.code));
            return p;
        } else if(an instanceof Block) {
            Block b = (Block) an;
            String p = "{";
            for(Statement s : b.getStatements())
                p = concat(p, rebuild_helper(s));
            p = concat(p, "}");
            return p;
        } else if(an instanceof IfStatement) {
            IfStatement ifs = (IfStatement) an;
            List<IfStatementBranch> lisb = ifs.getStatements();
            String p = "";
            for(int i=0;i<lisb.size();i++)
            {
                if(i == 0)
                    p = concat(p, "if");
                else
                {
                    if(lisb.get(i).getCondition() == null)
                        p = concat(p, "else");
                    else
                        p = concat(p, "else if");
                }

                if(lisb.get(i).getCondition() != null)
                {
                    p = concat(p, "(");
                    p = concat(p, rebuild_helper(lisb.get(i).getCondition()));
                    p = concat(p, ")");
                }
                p = concat(p, rebuild_helper(lisb.get(i).getBranch()));
            }
            return p;
        } else if(an instanceof FunctionCallViaStatic) {
            FunctionCallViaStatic fcvs = (FunctionCallViaStatic) an;
            String p = "";
            switch(fcvs.pointer.functionName)
            {
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "<<":
                case ">>":
                case "<":
                case ">":
                case "<=":
                case ">=":
                case "&&":
                case "&":
                case "||":
                case "|":
                case "^":
                case "==":
                case "!=":
                    boolean parenL = addParen(fcvs.arguments.get(0), fcvs.pointer.functionName);
                    boolean parenR = addParen(fcvs.arguments.get(1), fcvs.pointer.functionName);

                    if(parenL)
                        p = concat(p, "(");
                    p = concat(p, rebuild_helper(fcvs.arguments.get(0)));
                    if(parenL)
                        p = concat(p, ")");
                    p = concat(p, fcvs.pointer.functionName);
                    if(parenR)
                        p = concat(p, "(");
                    p = concat(p, rebuild_helper(fcvs.arguments.get(1)));
                    if(parenR)
                        p = concat(p, ")");
                    break;
                case "!":
                case "~":
                    boolean paren = addParen(fcvs.arguments.get(0), fcvs.pointer.functionName);

                    p = concat(p, fcvs.pointer.functionName);
                    if(paren)
                        p = concat(p, "(");
                    p = concat(p, rebuild_helper(fcvs.arguments.get(0)));
                    if(paren)
                        p = concat(p, ")");
                    break;
                default:
                    if(fcvs.called_on != null)
                        p = concat(p, rebuild_helper(fcvs.called_on));
                    if(fcvs.threaded)
                        p = concat(p, "thread");

                    FunctionPointer fp = fcvs.pointer;
                    if(fp.location != null)
                        p = concat(p, fp.location.path + "::");

                    p = concat(p, fp.functionName);
                    p = concat(p, "(");
                    for(int i=0;i<fcvs.arguments.size();i++)
                    {
                        if(i != 0)
                            p = concat(p, ",");
                        p = concat(p, rebuild_helper(fcvs.arguments.get(i)));
                    }
                    p = concat(p, ")");
                    break;
            }
            return p;
        } else if(an instanceof Assignment) {
            Assignment as = (Assignment)an;
            String p = "";
            p = concat(p, rebuild_helper(as.getVariable()));
            p = concat(p, as.getOperator());
            p = concat(p, rebuild_helper(as.getExpression()));
            return p;
        } else if(an instanceof Variable) {
            return ((Variable) an).getName();
        } else if(an instanceof StringLiteral) {
            return ((StringLiteral) an).getValue();
        } else if(an instanceof FunctionCallStatement) {
            return rebuild_helper(((FunctionCallStatement) an).getFunctionCall());
        } else if(an instanceof ForLoop) {
            ForLoop fl = (ForLoop) an;
            String p = "";
            p = concat(p, "for");
            p = concat(p, "(");
            if(fl.precond != null)
                p = concat(p, rebuild_helper(fl.precond));
            p = concat(p, ";");
            if(fl.cond != null)
                p = concat(p, rebuild_helper(fl.cond));
            p = concat(p, ";");
            if(fl.postcond != null)
                p = concat(p, rebuild_helper(fl.postcond));
            p = concat(p, ")");
            p = concat(p, rebuild_helper(fl.code));
            return p;
        } else if(an instanceof NumericLiteral) {
            String p = ((NumericLiteral) an).getValue().toString();
            // 10.0 -> 10
            if(p.endsWith(".0"))
                p = p.substring(0, p.length()-2);
            // 0.1 -> .1
            if(p.startsWith("0."))
                return p.substring(1);
            return p;
        } else if(an instanceof IncrementStatement) {
            String p = rebuild_helper(((IncrementStatement) an).variable);
            p = concat(p, "++");
            return p;
        } else if(an instanceof DecrementStatement) {
            String p = rebuild_helper(((DecrementStatement) an).variable);
            p = concat(p, "--");
            return p;
        } else if(an instanceof ReturnStatement) {
            ReturnStatement rs = (ReturnStatement) an;
            String p = "return";
            if(rs.value != null)
                p = concat(p, rebuild_helper(rs.value));
            return p;
        } else if(an instanceof IncludeStatement) {
            String p = "#include";
            p += ((IncludeStatement) an).path.path;
            p += ";";
            return p;
        } else if(an instanceof UsingAnimtreeStatement) {
            String p = "#using_animtree";
            p += '(';
            p += ((UsingAnimtreeStatement) an).animTreeName;
            p += ')';
            p += ';';
            return p;
        } else if(an instanceof StructMember) {
            String p = "";
            p = concat(p, rebuild_helper(((StructMember) an).parent));
            p = concat(p, ".");
            p = concat(p, ((StructMember) an).name);
            return p;
        } else if(an instanceof ArrayElement) {
            String p = "";
            p = concat(p, rebuild_helper(((ArrayElement) an).parent));
            p = concat(p, "[");
            p = concat(p, rebuild_helper(((ArrayElement) an).element));
            p = concat(p, "]");
            return p;
        } else if(an instanceof FunctionCallViaPointer) {
            String p = "";
            FunctionCallViaPointer fcvp = (FunctionCallViaPointer) an;
            if(fcvp.called_on != null)
                p = concat(p, rebuild_helper(fcvp.called_on));
            if(fcvp.threaded)
                p = concat(p, "thread");

            p = concat(p, "[[");

            p = concat(p, rebuild_helper(fcvp.pointer));

            p = concat(p, "]]");

            p = concat(p, "(");
            for(int i=0;i<fcvp.arguments.size();i++)
            {
                if(i != 0)
                    p = concat(p, ",");
                p = concat(p, rebuild_helper(fcvp.arguments.get(i)));
            }
            p = concat(p, ")");
            return p;
        } else if(an instanceof LocalizedStringLiteral) {
            return "&" + ((LocalizedStringLiteral) an).getValue();
        } else if(an instanceof WaitStatement) {
            WaitStatement rs = (WaitStatement) an;
            String p = "wait";
            if(rs.del != null)
                p = concat(p, rebuild_helper(rs.del));
            return p;
        } else if(an instanceof EmptyArrayLiteral) {
            return "[]";
        } else if(an instanceof FunctionPointer) {
            String p = "";
            if(((FunctionPointer) an).location != null)
                p = concat(p, ((FunctionPointer) an).location.path);
            p = concat(p, "::");
            p = concat(p, ((FunctionPointer) an).functionName);
            return p;
        } else if(an instanceof NotifyStatement) {
            NotifyStatement rs = (NotifyStatement) an;
            String p = "";
            if(rs.called_on != null)
                p = concat(p, rebuild_helper(rs.called_on));

            p = concat(p, "notify");
            p = concat(p, "(");
            for(int i=0;i<rs.args.size();i++)
            {
                if(i != 0)
                    p = concat(p, ",");
                p = concat(p, rebuild_helper(rs.args.get(i)));
            }
            p = concat(p, ")");
            return p;
        } else if(an instanceof EndonStatement) {
            EndonStatement es = (EndonStatement) an;
            String p = "";
            if(es.called_on != null)
                p = concat(p, rebuild_helper(es.called_on));

            p = concat(p, "endon");
            p = concat(p, "(");
            p = concat(p, rebuild_helper(es.event));
            p = concat(p, ")");
            return p;
        } else if(an instanceof UndefinedLiteral) {
            return "undefined";
        } else if(an instanceof ContinueStatement) {
            return "continue";
        } else if(an instanceof BreakStatement) {
            return "break";
        } else if(an instanceof WhileStatement) {
            String p = "";
            p = concat(p, "while");
            p = concat(p, "(");
            p = concat(p, rebuild_helper(((WhileStatement) an).getCondition()));
            p = concat(p, ")");
            p = concat(p, rebuild_helper(((WhileStatement) an).getBody()));
            return p;
        } else if(an instanceof WaittillframeendStatement) {
            return "waittillframeend";
        } else if(an instanceof WaittillStatement) {
            WaittillStatement wts = (WaittillStatement) an;
            String p = "";
            if(wts.called_on != null)
                p = concat(p, rebuild_helper(wts.called_on));
            p = concat(p, "waittill");
            p = concat(p, "(");
            for(int i=0;i<wts.args.size();i++)
            {
                if(i != 0)
                    p = concat(p, ",");
                p = concat(p, rebuild_helper(wts.args.get(i)));
            }
            p = concat(p, ")");
            return p;
        } else if(an instanceof DeveloperCommentProgram) {
            String p = "/#";
            for(AstNode a : ((DeveloperCommentProgram) an).elements)
                p = concat(p, rebuild_helper(a));
            p = concat(p, "#/");
            return p;
        } else if(an instanceof DeveloperComment) {
            String p = "/#";
            p = concat(p, rebuild_helper(((DeveloperComment) an).code));
            p = concat(p, "#/");
            return p;
        } else if(an instanceof SemicolonStatement) {
            return concat(rebuild_helper(((SemicolonStatement) an).statement), ";");
        } else if(an instanceof Vector) {
            return "(" + rebuild_helper(((Vector) an).getA()) + "," + rebuild_helper(((Vector) an).getB()) + "," + rebuild_helper(((Vector) an).getC()) + ")";
        } else if(an instanceof SwitchStatement) {
            SwitchStatement ss = (SwitchStatement) an;
            String p = "";
            p = concat(p, "switch");
            p = concat(p, "(");
            p = concat(p, rebuild_helper(ss.getCondition()));
            p = concat(p, ")");
            p = concat(p, "{");
            List<SwitchBranch> sb = ss.getBody();
            for (SwitchBranch aSb : sb) {
                for (int j = 0; j < aSb.cases.size(); j++) {
                    if (aSb.cases.get(j) instanceof SwitchConstantCase) {
                        p = concat(p, "case");
                        p = concat(p, rebuild_helper(((SwitchConstantCase) aSb.cases.get(j)).lit));
                        p = concat(p, ":");
                    } else if (aSb.cases.get(j) instanceof SwitchDefaultCase) {
                        p = concat(p, "default:");
                    }
                    Block b = aSb.code;

                    for (Statement s : b.getStatements())
                        p = concat(p, rebuild_helper(s));
                }
            }
            p = concat(p, "}");
            return p;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new IllegalArgumentException("an: "+an.getClass());
        }
    }

    // Liidab kokku kaks koodijuppi. Püüab vältida tühiku kasutamist kahe jupi vahel
    private static String concat(String a, String b)
    {
        if(a.isEmpty() || b.isEmpty())
            return a + b;

        char a_last = a.charAt(a.length()-1);
        char b_first = b.charAt(0);

        if((a_last == '-' || a_last == '+') && a_last == b_first)
            return a + " " + b;

        if(identifier_char(a_last) && identifier_char(b_first))
            return a + " " + b;

        return a+b;
    }

    static boolean identifier_char(char c)
    {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_';
    }

    // Kontroll kas sulge on tarvis
    static boolean addParen(Expression astnode, String operator)
    {
        if(astnode instanceof FunctionCallViaStatic)
        {
            String operator2 = ((FunctionCallViaStatic) astnode).pointer.functionName;
            int prec1 = getPrec(operator), prec2 = getPrec(operator2);
            return prec2 != -1 && prec1 < prec2;
        }
        return false;
    }

    // Precedence for binary operations
    static int getPrec(String function)
    {
        switch (function)
        {
            case "!":
            case "~":
                return 3;
            case "*":
            case "/":
            case "%":
                return 5;
            case "+":
            case "-":
                return 6;
            case "<<":
            case ">>":
                return 7;
            case "<":
            case ">":
            case "<=":
            case ">=":
                return 8;
            case "==":
            case "!=":
                return 9;
            case "&":
                return 10;
            case "^":
                return 11;
            case "|":
                return 12;
            case "&&":
                return 13;
            case "||":
                return 14;
        }
        return -1;
    }
}
