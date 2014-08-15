package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class StructMember extends Expression implements Serializable {
    private Expression parent;
    private String identifier;

    public StructMember(Expression parent, String identifier) {
        this.parent = parent;
        this.identifier = identifier;
    }

    public Expression getParent() {
        return parent;
    }

    public void setParent(Expression parent) {
        this.parent = parent;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
