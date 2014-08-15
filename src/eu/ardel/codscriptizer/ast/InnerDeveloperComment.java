package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class InnerDeveloperComment extends Statement implements Serializable {
    private Block code;

    public InnerDeveloperComment(Block code) {
        this.code = code;
    }

    public Block getCode() {
        return code;
    }

    public void setCode(Block code) {
        this.code = code;
    }
}
