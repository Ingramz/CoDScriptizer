package ast;

import java.util.Arrays;
import java.util.List;

public class SemicolonStatement extends Statement
{
    public Statement statement;

    public SemicolonStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)statement);
    }
}
