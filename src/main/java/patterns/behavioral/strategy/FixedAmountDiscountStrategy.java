package patterns.behavioral.strategy;

import java.math.BigDecimal;

public class FixedAmountDiscountStrategy implements DiscountStrategy {

    private String displayName;
    private BigDecimal discountAmount;
    private BigDecimal minCartPrice;

    public FixedAmountDiscountStrategy(String displayName, BigDecimal discountAmount, BigDecimal minCartPrice) {
        this.displayName = displayName;
        this.discountAmount = discountAmount;
        this.minCartPrice = minCartPrice;
    }

    public FixedAmountDiscountStrategy(String displayName, double discountAmount, double minCartPrice) {
        this(displayName, BigDecimal.valueOf(discountAmount), BigDecimal.valueOf(minCartPrice));
    }

    @Override
    public BigDecimal applyDiscount(BigDecimal totalPrice) {
        return totalPrice.compareTo(minCartPrice) < 0 ? totalPrice : totalPrice.subtract(discountAmount);
    }

    public String getDisplayName() {
        return displayName;
    }
}
