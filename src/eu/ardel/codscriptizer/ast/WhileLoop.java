package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class WhileLoop extends Statement implements Serializable {
    private Expression condition;
    private Statement body;

    public WhileLoop(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }
}
