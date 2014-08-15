package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class Literal<T> extends Expression implements Serializable {
    private T value;

    public Literal(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
