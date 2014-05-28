package ast;

import java.util.Collections;
import java.util.List;

public abstract class FunctionCall extends Expression
{
    public List<Expression> arguments;
    public boolean threaded = false;
    public Expression called_on;

    public void setCalledOn(Expression called_on)
    {
        this.called_on = called_on;
    }

    public List<Expression> getArguments() {
        return Collections.unmodifiableList(arguments);
    }
}
