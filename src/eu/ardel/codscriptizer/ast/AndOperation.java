package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class AndOperation extends BinaryOperation implements Serializable {
    public AndOperation(Expression left, Expression right) {
        super(left, right);
    }
}
