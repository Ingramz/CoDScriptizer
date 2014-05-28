package ast;

import java.util.Arrays;
import java.util.List;

public class DeveloperComment extends Statement
{
    public Block code;

    public DeveloperComment(Block code) {
        this.code = code;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)code);
    }
}
