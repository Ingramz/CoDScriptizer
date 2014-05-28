package ast;

import java.util.Collections;
import java.util.List;

public class SwitchDefaultCase extends SwitchCase
{
    @Override
    public List<Object> getChildren() {
        return Collections.emptyList();
    }
}
