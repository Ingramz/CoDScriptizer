package ast;

import java.util.Arrays;
import java.util.List;


public class FunctionPointer extends Expression
{
    public FileLocation location;
    public String functionName;

    public FunctionPointer(FileLocation location, String functionName) {
        this.location = location;
        this.functionName = functionName;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)location, functionName);
    }
}
