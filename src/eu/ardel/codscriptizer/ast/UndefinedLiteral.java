package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class UndefinedLiteral extends Literal<String> implements Serializable {
    public UndefinedLiteral() {
        super("undefined");
    }
}
