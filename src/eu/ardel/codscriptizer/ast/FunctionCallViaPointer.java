package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class FunctionCallViaPointer extends FunctionCall implements Serializable {
    private FunctionPointer pointer;

    public FunctionCallViaPointer(List<Expression> arguments, boolean threaded, Expression calledOn, FunctionPointer pointer) {
        super(arguments, threaded, calledOn);
        this.pointer = pointer;
    }

    public FunctionPointer getPointer() {
        return pointer;
    }

    public void setPointer(FunctionPointer pointer) {
        this.pointer = pointer;
    }
}
