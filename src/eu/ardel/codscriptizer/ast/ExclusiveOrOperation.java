package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class ExclusiveOrOperation extends BinaryOperation implements Serializable {
    public ExclusiveOrOperation(Expression left, Expression right) {
        super(left, right);
    }
}
