package Interface_II;

public class CompareKiloDriven implements CustomComparator<Car> {
    /**
     * compare between kilo driven
     * @param car1 that is object of Car
     * @param car2 that is object of Car
     * @return integer > 0 in case of object1 more than object2, integer < 0 in case of object1 less than object2, and 0 in case of those two object has same value
     */
    @Override
    public int compareData(Car car1, Car car2) {
        if (car1.getKiloDriven() > car2.getKiloDriven()) {
            return 1;
        } else if (car1.getKiloDriven() < car2.getKiloDriven()) {
            return -1;
        }
        return 0;
    }

    @Override
    public double getData(Car car) {
        return car.getKiloDriven();
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
