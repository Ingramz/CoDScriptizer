package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class ArrayElement extends Expression implements Serializable {
    private Expression parent;
    private Expression element;

    public ArrayElement(Expression parent, Expression element) {
        this.parent = parent;
        this.element = element;
    }

    public Expression getParent() {
        return parent;
    }

    public void setParent(Expression parent) {
        this.parent = parent;
    }

    public Expression getElement() {
        return element;
    }

    public void setElement(Expression element) {
        this.element = element;
    }
}
