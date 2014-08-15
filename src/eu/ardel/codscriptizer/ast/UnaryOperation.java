package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public abstract class UnaryOperation extends Operation implements Serializable {
    private Expression expression;

    protected UnaryOperation(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
