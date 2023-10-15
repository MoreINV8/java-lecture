package store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    public Store() { products = new ArrayList<>(); }
    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int count(Counter<Product> counter) {
        return counter.countProduct(products);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
