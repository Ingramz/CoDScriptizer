package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class FunctionPointer extends AstNode implements Serializable {
    private FileLocation location;
    private String functionName;

    public FunctionPointer(FileLocation location, String functionName) {
        this.location = location;
        this.functionName = functionName;
    }

    public FileLocation getLocation() {
        return location;
    }

    public void setLocation(FileLocation location) {
        this.location = location;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
