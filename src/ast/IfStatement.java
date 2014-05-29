package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IfStatement extends Statement
{
    public List<IfStatementBranch> statements;

	public IfStatement(List<IfStatementBranch> statements) {
		this.statements = statements;
	}

	@Override
    public List<Object> getChildren() {
        return new ArrayList<Object>(statements);
    }

    public List<IfStatementBranch> getStatements() {
        return statements;
    }
}
