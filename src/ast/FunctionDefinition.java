package ast;

import java.util.Arrays;
import java.util.List;

public class FunctionDefinition extends AstNode
{
    public String name;
    public List<Variable> args;
    public Block code;

    public FunctionDefinition(String name, List<Variable> args, Block code) {
        this.name = name;
        this.args = args;
        this.code = code;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)name, args, code);
    }
}
