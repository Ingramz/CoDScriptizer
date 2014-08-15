package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class OuterDeveloperComment extends AstNode implements Serializable {
    private List<FunctionDefinition> elements;

    public OuterDeveloperComment(List<FunctionDefinition> elements) {
        this.elements = elements;
    }

    public List<FunctionDefinition> getElements() {
        return elements;
    }

    public void setElements(List<FunctionDefinition> elements) {
        this.elements = elements;
    }
}
