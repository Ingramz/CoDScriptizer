package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionCallViaPointer extends FunctionCall
{
    public Expression pointer;

    public FunctionCallViaPointer(Expression called_on, boolean threaded, Expression pointer, List<Expression> arguments) {
        this.called_on = called_on;
        this.threaded = threaded;
        this.pointer = pointer;
        this.arguments = arguments;
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
