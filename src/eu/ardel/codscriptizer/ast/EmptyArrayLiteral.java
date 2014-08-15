package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class EmptyArrayLiteral extends Literal<String> implements Serializable {
    public EmptyArrayLiteral() {
        super("[]");
    }
}
