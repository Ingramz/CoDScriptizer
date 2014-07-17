package ast;

public class AnimtreeLiteral extends Literal<String>
{
    public AnimtreeLiteral()
    {
        this(null);
    }

    public AnimtreeLiteral(String value) {
        super("#animtree");
    }
}
