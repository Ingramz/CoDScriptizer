package ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Block extends Statement
{
	public List<Statement> statements;

	public Block(List<Statement> statements) {
		this.statements = statements;
	}
	
	public List<Statement> getStatements() {
		return Collections.unmodifiableList(statements);
	}

	@Override
	public List<Object> getChildren() {
		return new ArrayList<Object>(statements); 
	}
}
