package ast;

import java.util.Arrays;
import java.util.List;

public class FileLocation extends AstNode
{
    public String path;

    public FileLocation(String path) {
        this.path = path;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)path);
    }
}
