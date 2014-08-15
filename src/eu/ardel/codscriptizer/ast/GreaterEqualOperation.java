package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class GreaterEqualOperation extends BinaryOperation implements Serializable {
    public GreaterEqualOperation(Expression left, Expression right) {
        super(left, right);
    }
}
