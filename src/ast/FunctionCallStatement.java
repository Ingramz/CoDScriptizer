package ast;

import java.util.Arrays;
import java.util.List;

public class FunctionCallStatement extends Statement
{
	public FunctionCall functioncall;

	public FunctionCallStatement(FunctionCall functioncall) {
		this.functioncall = functioncall;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)this.functioncall);
	}

	public FunctionCall getFunctionCall() {
		return functioncall;
	}
}
