package Interface_I;

public class Product implements CustomCompare, Comparable {
    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getDataToCompare() {
        return getPrice();
    }

    @Override
    public int compareTo(Object o) {
        Product comProduct = (Product) o;
        if (this.getPrice() > comProduct.getPrice()) {
            return 1;
        } else if (this.getPrice() < comProduct.getPrice()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// ไชยภัทร ศรีอำไพ 6510450305

