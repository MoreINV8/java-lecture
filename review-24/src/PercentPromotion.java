public class PercentPromotion implements Promotion {
    @Override
    public double discount(double total) {
        return total * 0.1;
    }
}
