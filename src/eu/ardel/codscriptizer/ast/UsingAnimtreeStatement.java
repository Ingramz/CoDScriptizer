package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class UsingAnimtreeStatement extends AstNode implements Serializable {
    private String animtreeName;

    public UsingAnimtreeStatement(String animtreeName) {
        this.animtreeName = animtreeName;
    }

    public String getAnimtreeName() {
        return animtreeName;
    }

    public void setAnimtreeName(String animtreeName) {
        this.animtreeName = animtreeName;
    }
}
