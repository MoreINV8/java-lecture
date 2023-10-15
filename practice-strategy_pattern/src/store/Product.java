package store;

public class Product {
    private String name; // ชื่อสินค้า
    private double price; // ราคาสินค้า
    private int quantity; // จํานวนในสต็อคของสินค้านี้

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
