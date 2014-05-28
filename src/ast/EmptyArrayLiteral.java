package ast;

public class EmptyArrayLiteral extends Literal<String>
{
    public EmptyArrayLiteral()
    {
        this(null);
    }

    public EmptyArrayLiteral(String value) {
        super("[]");
    }
}
