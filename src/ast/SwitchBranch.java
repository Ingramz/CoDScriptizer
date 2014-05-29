package ast;

import java.util.Arrays;
import java.util.List;

public class SwitchBranch extends AstNode
{
    public List<SwitchCase> cases;
    public Block code;

    public SwitchBranch(List<SwitchCase> cases, Block code) {
        this.cases = cases;
        this.code = code;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)cases, code);
    }
}
