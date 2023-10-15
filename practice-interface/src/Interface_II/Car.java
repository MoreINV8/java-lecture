package Interface_II;

public class Car {
    private String license;
    private double kiloDriven; // ระยะทางการขับ

    // ขออนุญาติเพิ่ม constructor
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
}

// ไชยภัทร ศรีอำไพ 6510450305

