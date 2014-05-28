package ast;

import java.util.Arrays;
import java.util.List;

public class IncludeStatement extends AstNode
{
    public FileLocation path;

    public IncludeStatement(FileLocation path) {
        this.path = path;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)path);
    }
}
