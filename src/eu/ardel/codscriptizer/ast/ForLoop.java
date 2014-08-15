package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class ForLoop extends AstNode implements Serializable {
    private Statement precondition;
    private Expression condition;
    private Statement postcondition;
    private Statement code;

    public ForLoop(Statement precondition, Expression condition, Statement postcondition, Statement code) {
        this.precondition = precondition;
        this.condition = condition;
        this.postcondition = postcondition;
        this.code = code;
    }

    public Statement getPrecondition() {
        return precondition;
    }

    public void setPrecondition(Statement precondition) {
        this.precondition = precondition;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getPostcondition() {
        return postcondition;
    }

    public void setPostcondition(Statement postcondition) {
        this.postcondition = postcondition;
    }

    public Statement getCode() {
        return code;
    }

    public void setCode(Statement code) {
        this.code = code;
    }
}
