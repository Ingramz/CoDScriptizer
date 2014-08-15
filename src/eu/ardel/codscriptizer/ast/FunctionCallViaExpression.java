package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class FunctionCallViaExpression extends FunctionCall implements Serializable {
    private Expression expression;

    public FunctionCallViaExpression(List<Expression> arguments, boolean threaded, Expression calledOn, Expression expression) {
        super(arguments, threaded, calledOn);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
