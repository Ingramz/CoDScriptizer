package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class WaitStatement extends AstNode implements Serializable {
    private Expression delay;

    public WaitStatement(Expression delay) {
        this.delay = delay;
    }

    public Expression getDelay() {
        return delay;
    }

    public void setDelay(Expression delay) {
        this.delay = delay;
    }
}
