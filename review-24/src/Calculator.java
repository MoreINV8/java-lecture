public class Calculator {
    private double total;
    public Calculator(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void discount(Promotion[] promotions) {
        for (Promotion promotion : promotions) {
            total -= promotion.discount(total);
        }
    }
}
