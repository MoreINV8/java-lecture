public class CouponPromotion implements Promotion {
    private double discount;
    public CouponPromotion(double discount) {
        this.discount = discount;
    }
    @Override
    public double discount(double total) {
        return discount;
    }
}
