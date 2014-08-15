package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class NotEqualOperation extends BinaryOperation implements Serializable {
    public NotEqualOperation(Expression left, Expression right) {
        super(left, right);
    }
}
