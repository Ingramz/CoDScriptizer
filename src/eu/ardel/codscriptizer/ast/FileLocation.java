package eu.ardel.codscriptizer.ast;

import java.io.Serializable;

public class FileLocation extends AstNode implements Serializable {
    private String path;

    public FileLocation(String path) {
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
