package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfStatementBranch extends Statement {
    private Expression condition;
    private Statement branch;

    public IfStatementBranch(Expression condition, Statement branch) {
        this.condition = condition;
        this.branch = branch;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)condition, branch);
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getBranch() {
        return branch;
    }
}
