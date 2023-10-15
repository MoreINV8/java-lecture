package Interface_II;

import java.util.Comparator;

public class LicenseComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        String license1 = o1.getLicense();
        String license2 = o2.getLicense();
        return license1.compareTo(license2);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
