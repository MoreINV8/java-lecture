package II;

public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(Product product) {
        this(product.getProductName(), product.getPrice());
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 0;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return productName + "\t\t" + price + "\t" + quantity + "\t";
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
