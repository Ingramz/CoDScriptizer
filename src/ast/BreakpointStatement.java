package ast;

import java.util.Collections;
import java.util.List;

public class BreakpointStatement extends Statement
{
    @Override
    public List<Object> getChildren() {
        return Collections.emptyList();
    }
}
