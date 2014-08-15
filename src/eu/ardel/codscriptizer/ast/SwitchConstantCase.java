package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class SwitchConstantCase extends SwitchCase implements Serializable {
    private Literal literal;

    public SwitchConstantCase(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }
}
