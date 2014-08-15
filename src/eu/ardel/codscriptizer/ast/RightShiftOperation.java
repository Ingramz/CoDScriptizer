package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class RightShiftOperation extends BinaryOperation implements Serializable {
    public RightShiftOperation(Expression left, Expression right) {
        super(left, right);
    }
}
