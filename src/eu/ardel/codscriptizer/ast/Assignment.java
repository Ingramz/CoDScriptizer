package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class Assignment extends Statement implements Serializable {
    private Expression lvalue;
    private Expression rvalue;

    public Assignment(Expression lvalue, Expression rvalue) {
        this.lvalue = lvalue;
        this.rvalue = rvalue;
    }

    public Expression getLvalue() {
        return lvalue;
    }

    public void setLvalue(Expression lvalue) {
        this.lvalue = lvalue;
    }

    public Expression getRvalue() {
        return rvalue;
    }

    public void setRvalue(Expression rvalue) {
        this.rvalue = rvalue;
    }
}
