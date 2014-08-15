package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class Variable extends Expression implements Serializable {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
