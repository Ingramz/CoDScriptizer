package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class SwitchStatement extends Statement implements Serializable {
    private Expression condition;
    private List<SwitchBranch> body;

    public SwitchStatement(Expression condition, List<SwitchBranch> body) {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<SwitchBranch> getBody() {
        return body;
    }

    public void setBody(List<SwitchBranch> body) {
        this.body = body;
    }
}
