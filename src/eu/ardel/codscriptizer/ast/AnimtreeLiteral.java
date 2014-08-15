package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class AnimtreeLiteral extends Literal<String> implements Serializable {
    public AnimtreeLiteral() {
        super("#animtree");
    }
}
