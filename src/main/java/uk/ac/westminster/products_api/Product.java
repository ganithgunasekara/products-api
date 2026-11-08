package uk.ac.westminster.products_api;

// 1. The CLASS is marked abstract
public abstract class Product {
    private Long id;
    private String name;
    private double price;

    // 2. The constructor is normal, with parentheses ()
    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 3. The METHOD is marked abstract, and ends with a semicolon (no body)
    public abstract String getSummary();

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}