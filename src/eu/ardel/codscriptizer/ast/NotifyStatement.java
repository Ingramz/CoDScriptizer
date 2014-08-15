package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class NotifyStatement extends Statement implements Serializable {
    private Expression entity;
    private List<Expression> arguments;

    public NotifyStatement(Expression entity, List<Expression> arguments) {
        this.entity = entity;
        this.arguments = arguments;
    }

    public Expression getEntity() {
        return entity;
    }

    public void setEntity(Expression entity) {
        this.entity = entity;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }
}
