package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LogicalAndOperation extends BinaryOperation implements Serializable {
    public LogicalAndOperation(Expression left, Expression right) {
        super(left, right);
    }
}
