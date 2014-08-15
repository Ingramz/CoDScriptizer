package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LessOperation extends BinaryOperation implements Serializable {
    public LessOperation(Expression left, Expression right) {
        super(left, right);
    }
}
