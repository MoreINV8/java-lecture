package Interface_I;

public class Car implements CustomCompare, Comparable {
    private String license;
    private double kiloDriven;

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public String getLicense() {
        return license;
    }

    public double getKiloDriven() {
        return kiloDriven;
    }

    @Override
    public double getDataToCompare() {
        return getKiloDriven();
    }

    @Override
    public int compareTo(Object o) {
        Car comCar = (Car) o;
        if (this.getKiloDriven() > comCar.getKiloDriven()) {
            return 1;
        } else if (this.getKiloDriven() < comCar.getKiloDriven()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
