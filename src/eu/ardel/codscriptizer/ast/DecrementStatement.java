package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class DecrementStatement extends Statement implements Serializable {
    private Expression expression;

    public DecrementStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
