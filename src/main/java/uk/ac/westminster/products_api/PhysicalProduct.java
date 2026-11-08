package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares core attributes like id, name, and price, but requires physical shipping.
// A ShoppingCart would NOT pass this test because it HAS-A Product rather than being a type of Product.
public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    // TODO (a): empty no-arg constructor for Jackson

    public PhysicalProduct() {
    }

    // TODO (b): full constructor.

    public PhysicalProduct(Long id, String name, double price, String dimensions, double weightKg) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName() + " | Weight: " + getWeightKg() + "kg";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }


    // TODO (c): getWeightKg() and getDimensions()

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }


}
