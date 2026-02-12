package patterns.behavioral.strategy;

import java.math.BigDecimal;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(BigDecimal totalPrice) {
        return totalPrice;
    }

}
