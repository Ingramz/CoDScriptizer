package ast;

import java.util.Arrays;
import java.util.List;

/**
 * Erinevate literaaliklasside ülemklass.
 */
public class Literal<T> extends Expression {
    protected T value;

    public Literal(T value) {
        this.value = value;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object)this.value);
    }

    public T getValue() {
        return value;
    }
}
