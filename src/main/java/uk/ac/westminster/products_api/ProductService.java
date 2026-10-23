package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        // DigitalProduct constructor: id, name, price, downloadUrl, fileSizeMB
        products.add(new DigitalProduct(
                nextId++, "Clean Code (E-book)", 29.99, "/downloads/clean-code.pdf", 4.2
        ));

        // PhysicalProduct constructor updated to match your class: id, name, price, dimensions, weightKg
        products.add(new PhysicalProduct(
                nextId++, "27-inch Monitor", 249.99, "61cm x 41cm x 18cm", 5.4
        ));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}