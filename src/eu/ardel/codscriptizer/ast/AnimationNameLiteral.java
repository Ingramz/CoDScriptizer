package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class AnimationNameLiteral extends Literal<String> implements Serializable {
    public AnimationNameLiteral(String value) {
        super(value);
    }
}
