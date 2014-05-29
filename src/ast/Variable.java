package ast;

import java.util.Arrays;
import java.util.List;

public class Variable extends Expression {

	public String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)name);
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = new String(name);
    }
}
