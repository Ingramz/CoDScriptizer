package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class MultiplicationOperation extends BinaryOperation implements Serializable {
    public MultiplicationOperation(Expression left, Expression right) {
        super(left, right);
    }
}
