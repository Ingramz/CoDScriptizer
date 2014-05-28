package ast;

import java.util.Arrays;
import java.util.List;

public class UsingAnimtreeStatement extends AstNode
{
    private String animTreeName;

    public UsingAnimtreeStatement(String animTreeName) {
        this.animTreeName = animTreeName;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)animTreeName);
    }
}
