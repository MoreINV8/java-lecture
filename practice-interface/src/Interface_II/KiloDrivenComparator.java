package Interface_II;

import java.util.Comparator;

public class KiloDrivenComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getKiloDriven() > o2.getKiloDriven()) {
            return 1;
        } else if (o1.getKiloDriven() < o2.getKiloDriven()) {
            return -1;
        }
        return 0;
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
