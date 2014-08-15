package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class InclusiveOrOperation extends BinaryOperation implements Serializable {
    public InclusiveOrOperation(Expression left, Expression right) {
        super(left, right);
    }
}
