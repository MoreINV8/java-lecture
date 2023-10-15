package Interface_II;

public class ComparePrice implements CustomComparator<Product> {

    /**
     * compare between Product price
     * @param product1 that is object of Product
     * @param product2 that is object of Product
     * @return integer > 0 in case of object1 more than object2, integer < 0 in case of object1 less than object2, and 0 in case of those two object has same value
     */
    @Override
    public int compareData(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return 1;
        } else if (product1.getPrice() < product2.getPrice()) {
            return -1;
        }
        return 0;
    }

    @Override
    public double getData(Product product) {
        return product.getPrice();
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
