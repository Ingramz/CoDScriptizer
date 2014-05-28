package ast;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Indrek on 26.05.2014.
 */
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
