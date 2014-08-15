package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class EndonStatement extends Statement implements Serializable {
    private Expression entity;
    private Expression argument;

    public EndonStatement(Expression entity, Expression argument) {
        this.entity = entity;
        this.argument = argument;
    }

    public Expression getEntity() {
        return entity;
    }

    public void setEntity(Expression entity) {
        this.entity = entity;
    }

    public Expression getArgument() {
        return argument;
    }

    public void setArgument(Expression argument) {
        this.argument = argument;
    }
}
