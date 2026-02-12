package patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageDiscountStrategy implements DiscountStrategy {

    private String displayName;
    private BigDecimal discountPercentage;
    private BigDecimal minCartPrice;

    public PercentageDiscountStrategy(String displayName, BigDecimal discountPercentage, BigDecimal minCartPrice) {
        this.displayName = displayName;
        this.discountPercentage = discountPercentage;
        this.minCartPrice = minCartPrice;
    }

    public PercentageDiscountStrategy(String displayName, double discountPercentage, double minCartPrice) {
        this(displayName, BigDecimal.valueOf(discountPercentage), BigDecimal.valueOf(minCartPrice));
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal totalPrice) {
        if (totalPrice.compareTo(minCartPrice) < 0) {
            return totalPrice;
        }

        BigDecimal multiplier = BigDecimal.valueOf(100).subtract(discountPercentage);
        return totalPrice.multiply(multiplier)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    public String getDisplayName() {
        return displayName;
    }
}
