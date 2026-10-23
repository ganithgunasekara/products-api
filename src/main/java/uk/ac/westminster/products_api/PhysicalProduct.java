package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares core attributes like id, name, and price, but requires physical shipping.
// A ShoppingCart would NOT pass this test because it HAS-A Product rather than being a type of Product.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // TODO (a): empty no-arg constructor for Jackson

    public PhysicalProduct() {
    }

    // TODO (b): full constructor.

    public PhysicalProduct(Long id, String name, double price, String dimensions, double weightKg) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }


    // TODO (c): getWeightKg() and getDimensions()

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
