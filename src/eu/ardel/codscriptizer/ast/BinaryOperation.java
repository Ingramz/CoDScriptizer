package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public abstract class BinaryOperation extends Operation implements Serializable {
    private Expression left, right;

    protected BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}
