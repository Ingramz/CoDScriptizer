package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.util.List;

public class WaittillStatement extends Statement implements Serializable {
    private Expression entity;
    private Expression event;
    private List<Expression> arguments;

    public WaittillStatement(Expression entity, Expression event, List<Expression> arguments) {
        this.entity = entity;
        this.event = event;
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

    public Expression getEvent() {
        return event;
    }

    public void setEvent(Expression event) {
        this.event = event;
    }
}
