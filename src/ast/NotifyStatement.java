package ast;

import java.util.Arrays;
import java.util.List;

public class NotifyStatement extends Statement
{
    public Expression called_on;
    public List<Expression> args;

    public NotifyStatement(Expression called_on, List<Expression> args) {
        this.called_on = called_on;
        this.args = args;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)called_on, args);
    }
}
