package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class Block extends Statement implements Serializable {
    private List<Statement> statements;

    public Block(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
