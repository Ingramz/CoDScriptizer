package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public abstract class FunctionCall extends Expression implements Serializable {
    private List<Expression> arguments;
    private boolean threaded = false;
    private Expression calledOn;

    protected FunctionCall(List<Expression> arguments, boolean threaded, Expression calledOn) {
        this.arguments = arguments;
        this.threaded = threaded;
        this.calledOn = calledOn;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public boolean isThreaded() {
        return threaded;
    }

    public void setThreaded(boolean threaded) {
        this.threaded = threaded;
    }

    public Expression getCalledOn() {
        return calledOn;
    }

    public void setCalledOn(Expression calledOn) {
        this.calledOn = calledOn;
    }
}
