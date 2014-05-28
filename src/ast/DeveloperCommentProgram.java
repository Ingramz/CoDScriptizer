package ast;

import java.util.ArrayList;
import java.util.List;

public class DeveloperCommentProgram extends AstNode
{
    public List<AstNode> elements;

    public DeveloperCommentProgram(List<AstNode> elements) {
        this.elements = elements;
    }

    @Override
    public List<Object> getChildren()
    {
        return new ArrayList<Object>(elements);
    }
}
