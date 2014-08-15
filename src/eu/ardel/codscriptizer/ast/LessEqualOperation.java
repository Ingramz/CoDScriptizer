package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LessEqualOperation extends BinaryOperation implements Serializable {
    public LessEqualOperation(Expression left, Expression right) {
        super(left, right);
    }
}
