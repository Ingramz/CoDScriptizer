package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class IncludeStatement extends AstNode implements Serializable {
    private FileLocation path;

    public IncludeStatement(FileLocation path) {
        this.path = path;
    }
}
