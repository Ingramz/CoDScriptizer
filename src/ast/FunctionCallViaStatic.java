package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionCallViaStatic extends FunctionCall
{
    public FunctionPointer pointer;

    public FunctionCallViaStatic(Expression called_on, boolean threaded, FunctionPointer pointer, List<Expression> arguments) {
        this.called_on = called_on;
        this.threaded = threaded;
        this.arguments = arguments;
        this.pointer = pointer;
    }

    @Override
    public List<Object> getChildren() {
        List<Object> result = new ArrayList<Object>();
        result.add(this.called_on);
        result.add(this.threaded);
        result.add(this.pointer);
        result.addAll(this.arguments);
        return result;
    }
}
