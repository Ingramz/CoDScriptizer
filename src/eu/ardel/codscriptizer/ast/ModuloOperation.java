package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class ModuloOperation extends BinaryOperation implements Serializable {
    public ModuloOperation(Expression left, Expression right) {
        super(left, right);
    }
}
