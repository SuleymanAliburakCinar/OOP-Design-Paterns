package patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public Cart() {
        discountStrategy = new NoDiscountStrategy();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean add(Product product) {
        return products.add(product);
    }

    public boolean remove(Product product) {
        return products.remove(product);
    }

    public void clearCart() {
        products.clear();
    }

    public BigDecimal calcPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : getProducts()) {
            total = total.add(product.getPrice());
        }

        return discountStrategy.applyDiscount(total);
    }
}
