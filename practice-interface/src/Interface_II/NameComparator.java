package Interface_II;

import java.util.Comparator;

public class NameComparator implements Comparator <Product> {
    @Override
    public int compare(Product o1, Product o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
