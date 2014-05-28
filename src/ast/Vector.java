package ast;

import java.util.Arrays;
import java.util.List;

/**
 * while-lause.
 */
public class Vector extends Expression {

    private Expression a;
    private Expression b;
    private Expression c;

    public Vector(Expression a, Expression b, Expression c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)a,b,c);
    }

    public Expression getA() {
        return a;
    }

    public Expression getB() {
        return b;
    }

    public Expression getC() {
        return c;
    }
}
