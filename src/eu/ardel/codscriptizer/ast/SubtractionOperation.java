package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class SubtractionOperation extends BinaryOperation implements Serializable {
    public SubtractionOperation(Expression left, Expression right) {
        super(left, right);
    }
}
