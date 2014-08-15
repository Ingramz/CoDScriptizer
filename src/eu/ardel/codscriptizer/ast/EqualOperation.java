package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class EqualOperation extends BinaryOperation implements Serializable {
    public EqualOperation(Expression left, Expression right) {
        super(left, right);
    }
}
