package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class FunctionCallStatement extends Statement implements Serializable {
    private FunctionCall functionCall;

    public FunctionCallStatement(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }
}
