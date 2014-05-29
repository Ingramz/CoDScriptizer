package ast;

import java.util.Arrays;
import java.util.List;

public class StructMember extends Expression
{
    public Expression parent;
    public String name;

    public StructMember(String name, Expression parent) {
        this.name = name;
        this.parent = parent;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) name, parent);
    }
}
