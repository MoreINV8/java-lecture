package II;

import java.io.PrintStream;
import java.util.ArrayList;

public class Store {
    private String storeName;
    private String location;
    private ArrayList<Product> products;
    private ArrayList<Product> purchaseProduct;

    public Store(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
        this.products = new ArrayList<>();
        this.purchaseProduct = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void addProduct(String productName, double price) {
        if (findProductByName(productName) == null) {
            products.add(new Product(productName, price));
        }
    }

    public String purchase(String productName, int quantity) {
        Product product = findProductByName(productName);

        if (product != null) {
            product = new Product(product);
            product.setQuantity(quantity);
            purchaseProduct.add(product);

            return "You have purchase " + productName + " amount " + quantity + ".";
        }
        return "Sorry,we have no " + productName + " in our store.";
    }

    public void billing() {
        System.out.println("I N V O I C E");
        System.out.println();
        System.out.println(storeName);
        System.out.println(location);
        System.out.println();
        System.out.println("Description\t\tPrice\tQty\tSubtotal");
        for (Product product : purchaseProduct) {
            System.out.printf("%10s\t\t%3.2f\t%2d\t%4.2f\n",
                    product.getProductName(), product.getPrice(), product.getQuantity(), totalCost(product));
        }
        System.out.println();
        System.out.println("TOTAL TO PAY: " + totalCost());
    }

    private double totalCost(Product product) {
        return product.getPrice() * product.getQuantity();
    }

    private double totalCost() {
        double total = 0;
        for (Product product : products) {
            total += totalCost(product);
        }
        return total;
    }

    private Product findProductByName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
