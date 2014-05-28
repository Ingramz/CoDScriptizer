package ast;

import java.util.Arrays;
import java.util.List;

/** 
 * Omistamine
 */
public class Assignment extends Statement {
	
	private Expression variable;
    private String operator;
	private Expression expression;

	public Assignment(Expression variable, String operator, Expression expression) {
		this.variable = variable;
        this.operator = operator;
		this.expression = expression;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)variable, operator, expression);
	}
	
	public Expression getExpression() {
		return expression;
	}

    public Expression getVariable() {
        return variable;
    }

    public String getOperator() {
        return operator;
    }
}
