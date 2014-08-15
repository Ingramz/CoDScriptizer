package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class GreaterOperation extends BinaryOperation implements Serializable {
    public GreaterOperation(Expression left, Expression right) {
        super(left, right);
    }
}
