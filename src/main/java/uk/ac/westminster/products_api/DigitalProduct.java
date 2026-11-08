package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    // no-arg constructor - Jackson needs this to build an object from incoming JSON
    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        // MUST be the first statement
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

}
