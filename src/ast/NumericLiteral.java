package ast;

import java.math.BigDecimal;

public class NumericLiteral extends Literal<BigDecimal> {

    public NumericLiteral(BigDecimal value) {
        super(value);
    }

    public String getCompactForm()
    {
        String outp = value.toPlainString();
        if(outp.startsWith("0."))
            outp = outp.substring(1);
        return outp;
    }
}
