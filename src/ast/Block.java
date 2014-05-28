package ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lausete jada.
 * 
 * Seda võib kasutada nii terve programmi tähistamiseks, kui ka 
 * loogelistes sulgudes oleva lausete jada tähistamiseks. 
 */
public class Block extends Statement {
	
	List<Statement> statements;

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
