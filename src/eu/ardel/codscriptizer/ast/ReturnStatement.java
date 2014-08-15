package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class ReturnStatement extends Statement implements Serializable {
    private Expression value;

    public ReturnStatement(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
