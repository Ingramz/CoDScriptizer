package ast;

import java.util.Arrays;
import java.util.List;

public class DecrementStatement extends Statement
{
    public Expression variable;

    public DecrementStatement(Expression variable) {
        this.variable = variable;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)variable);
    }
}
