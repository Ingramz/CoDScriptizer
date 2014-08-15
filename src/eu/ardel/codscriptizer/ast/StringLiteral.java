package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class StringLiteral extends Literal<String> implements Serializable {
    public StringLiteral(String value) {
        super(value);
    }
}
