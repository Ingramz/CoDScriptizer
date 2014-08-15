package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LogicalNotOperation extends UnaryOperation implements Serializable {
    public LogicalNotOperation(Expression expression) {
        super(expression);
    }
}
