package patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Driver {
    public static void main(String[] args) {
        Product p1 = new Product(new BigDecimal("30000"), "Laptop");
        Product p2 = new Product(new BigDecimal("200"), "Type C Kablo");

        Cart cart = new Cart();
        cart.add(p1);
        cart.add(p2);

        DiscountStrategy d1 = new FixedAmountDiscountStrategy("Hoşgeldin 50", new BigDecimal("500"),
                new BigDecimal("6000"));
        DiscountStrategy d2 = new PercentageDiscountStrategy("Yüzde 10", new BigDecimal("10"), new BigDecimal("2000"));

        System.out.println("----------------------------------------------------------");
        System.out.println("Cart Price with no discount strategy: " + cart.calcPrice());
        cart.setDiscountStrategy(d1);
        System.out.println("Cart Price with fixed amount discount strategy: " + cart.calcPrice());
        cart.setDiscountStrategy(d2);
        System.out.println("Cart Price with percentage amount discount strategy: " + cart.calcPrice());
    }
}
