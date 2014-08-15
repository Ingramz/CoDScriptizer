package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class AdditionOperation extends BinaryOperation implements Serializable {
    public AdditionOperation(Expression left, Expression right) {
        super(left, right);
    }
}
