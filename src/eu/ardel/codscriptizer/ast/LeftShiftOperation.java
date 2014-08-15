package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LeftShiftOperation extends BinaryOperation implements Serializable {
    public LeftShiftOperation(Expression left, Expression right) {
        super(left, right);
    }
}
