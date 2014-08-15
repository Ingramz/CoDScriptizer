package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class Vector extends Expression implements Serializable {
    private Expression x, y, z;

    public Vector(Expression x, Expression y, Expression z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Expression getX() {
        return x;
    }

    public void setX(Expression x) {
        this.x = x;
    }

    public Expression getY() {
        return y;
    }

    public void setY(Expression y) {
        this.y = y;
    }

    public Expression getZ() {
        return z;
    }

    public void setZ(Expression z) {
        this.z = z;
    }
}
