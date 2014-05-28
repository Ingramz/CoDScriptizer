package ast;

import java.util.Arrays;
import java.util.List;

public class EndonStatement extends Statement
{
    public Expression called_on;
    public Expression event;

    public EndonStatement(Expression called_on, Expression event) {
        this.called_on = called_on;
        this.event = event;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)called_on, event);
    }
}
