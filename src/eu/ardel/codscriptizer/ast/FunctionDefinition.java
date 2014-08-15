package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class FunctionDefinition extends AstNode implements Serializable {
    private FunctionPointer pointer;
    private List<Variable> parameters;
    private Block code;

    public FunctionDefinition(FunctionPointer pointer, List<Variable> parameters, Block code) {
        this.pointer = pointer;
        this.parameters = parameters;
        this.code = code;
    }

    public FunctionPointer getPointer() {
        return pointer;
    }

    public void setPointer(FunctionPointer pointer) {
        this.pointer = pointer;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }

    public Block getCode() {
        return code;
    }

    public void setCode(Block code) {
        this.code = code;
    }
}
