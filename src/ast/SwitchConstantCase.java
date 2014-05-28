package ast;

import java.util.Arrays;
import java.util.List;

public class SwitchConstantCase extends SwitchCase
{
    public Literal lit;

    public SwitchConstantCase(Literal lit) {
        this.lit = lit;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)lit);
    }
}
