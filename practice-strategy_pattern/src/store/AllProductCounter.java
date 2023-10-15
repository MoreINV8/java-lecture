package store;

import java.util.List;

public class AllProductCounter implements Counter<Product> {
    // นับจํานวนสินค้าทั้งหมด ทั้งมีในสต็อคหรือหมดสต็อคแล้ว
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            count += 1;
        }
        return count;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
