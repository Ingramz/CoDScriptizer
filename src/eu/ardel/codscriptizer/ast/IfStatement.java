package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class IfStatement extends Statement implements Serializable {
    private Expression condition;
    private Statement ifBranch, elseBranch;

    public IfStatement(Expression condition, Statement ifBranch, Statement elseBranch) {
        this.condition = condition;
        this.ifBranch = ifBranch;
        this.elseBranch = elseBranch;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getIfBranch() {
        return ifBranch;
    }

    public void setIfBranch(Statement ifBranch) {
        this.ifBranch = ifBranch;
    }

    public Statement getElseBranch() {
        return elseBranch;
    }

    public void setElseBranch(Statement elseBranch) {
        this.elseBranch = elseBranch;
    }
}
