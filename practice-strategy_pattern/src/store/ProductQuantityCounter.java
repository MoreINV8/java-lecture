package store;

import java.util.List;

public class ProductQuantityCounter implements Counter<Product> {
    // นับจํานวนในสต็อคของสินค้าทั้งหมด
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
