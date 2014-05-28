package ast;

import java.util.Arrays;
import java.util.List;

public class SwitchStatement extends Statement {

	private Expression condition;
	private List<SwitchBranch> body;

	public SwitchStatement(Expression condition, List<SwitchBranch> body) {
		this.condition = condition;
		this.body = body;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, body);
	}
	
	public Expression getCondition() {
		return condition;
	}
	
	public List<SwitchBranch> getBody() {
		return body;
	}
}
