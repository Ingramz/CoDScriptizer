package ast;

import java.util.Arrays;
import java.util.List;

public class IncrementStatement extends Statement
{
    public Expression variable;

    public IncrementStatement(Expression variable) {
        this.variable = variable;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)variable);
    }
}
