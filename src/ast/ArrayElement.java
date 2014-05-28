package ast;

import java.util.Arrays;
import java.util.List;

public class ArrayElement extends Expression {

    public Expression parent;
    public Expression element;

    public ArrayElement(Expression parent, Expression element) {
        this.parent = parent;
        this.element = element;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) parent, element);
    }
}
