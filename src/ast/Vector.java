package ast;

import java.util.Arrays;
import java.util.List;

public class Vector extends Expression {

    public Expression a;
    public Expression b;
    public Expression c;

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
