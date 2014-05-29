package ast;

import java.util.Arrays;
import java.util.List;

public class WaitStatement extends Statement
{
    public Expression del;

    public WaitStatement(Expression del) {
        this.del = del;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)del);
    }
}
