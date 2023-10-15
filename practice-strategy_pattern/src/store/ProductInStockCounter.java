package store;

import java.util.List;

public class ProductInStockCounter implements Counter<Product> {
    // นับจํานวนสินค้าทั้งหมดที่มีเหลืออยู่ในสต็อค
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
