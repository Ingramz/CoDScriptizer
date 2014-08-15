package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class LocalizedStringLiteral extends Literal<String> implements Serializable {
    public LocalizedStringLiteral(String value) {
        super(value);
    }
}
