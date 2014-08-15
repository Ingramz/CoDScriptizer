package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class SwitchBranch extends AstNode implements Serializable {
    private List<SwitchCase> cases;
    private Block code;

    public SwitchBranch(List<SwitchCase> cases, Block code) {
        this.cases = cases;
        this.code = code;
    }

    public List<SwitchCase> getCases() {
        return cases;
    }

    public void setCases(List<SwitchCase> cases) {
        this.cases = cases;
    }

    public Block getCode() {
        return code;
    }

    public void setCode(Block code) {
        this.code = code;
    }
}
