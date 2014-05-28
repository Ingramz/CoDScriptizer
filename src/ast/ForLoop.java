package ast;

import java.util.Arrays;
import java.util.List;

public class ForLoop extends Statement
{
    public Statement precond;
    public Expression cond;
    public Statement postcond;
    public Statement code;

    public ForLoop(Statement precond, Expression cond, Statement postcond, Statement code) {
        this.precond = precond;
        this.cond = cond;
        this.postcond = postcond;
        this.code = code;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)precond, cond, postcond, code);
    }
}
