package ast;

public class UndefinedLiteral extends Literal<String>
{
    public UndefinedLiteral()
    {
        this(null);
    }

    public UndefinedLiteral(String value) {
        super("undefined");
    }
}
