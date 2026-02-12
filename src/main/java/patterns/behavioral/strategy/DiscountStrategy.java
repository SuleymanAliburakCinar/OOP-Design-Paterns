package patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal applyDiscount(BigDecimal totalPrice);
}
