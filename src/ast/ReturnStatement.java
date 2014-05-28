package ast;

import java.util.Arrays;
import java.util.List;

public class ReturnStatement extends Statement
{
    public Expression value;

    public ReturnStatement(Expression value) {
        this.value = value;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)value);
    }
}
