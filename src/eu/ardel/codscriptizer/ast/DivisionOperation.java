package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class DivisionOperation extends BinaryOperation implements Serializable {
    public DivisionOperation(Expression left, Expression right) {
        super(left, right);
    }
}
