public class ConditionPromotion implements Promotion {
    @Override
    public double discount(double total) {
        if (total > 3000) {
            return 300;
        }
        return 0;
    }
}
