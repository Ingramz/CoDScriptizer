package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class NotOperation extends UnaryOperation implements Serializable {
    public NotOperation(Expression expression) {
        super(expression);
    }
}
