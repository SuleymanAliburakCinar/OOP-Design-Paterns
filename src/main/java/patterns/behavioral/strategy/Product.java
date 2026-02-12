package patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private String name;

    public Product(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    public Product(double price, String name) {
        this(BigDecimal.valueOf(price), name);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
