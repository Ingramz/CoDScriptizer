package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends AstNode
{
    public List<AstNode> elements;

    public Program(List<AstNode> elements) {
        this.elements = elements;
    }

    @Override
    public List<Object> getChildren()
    {
        return new ArrayList<Object>(elements);
    }
}
