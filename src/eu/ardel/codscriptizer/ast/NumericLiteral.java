package eu.ardel.codscriptizer.ast;

import java.io.Serializable;
import java.math.BigDecimal;

public class NumericLiteral extends Literal<BigDecimal> implements Serializable {
    public NumericLiteral(BigDecimal value) {
        super(value);
    }
}
