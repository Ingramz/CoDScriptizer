package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LogicalOrOperation extends BinaryOperation implements Serializable {
    public LogicalOrOperation(Expression left, Expression right) {
        super(left, right);
    }
}
