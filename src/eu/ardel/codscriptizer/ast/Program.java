package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Program extends AstNode implements Serializable {
    private List<AstNode> elements;

    public Program(List<AstNode> elements) {
        this.elements = elements;
    }

    public Program() {
        this.elements = new ArrayList<AstNode>();
    }

    public void addElement(AstNode element) {
        this.elements.add(element);
    }
}
