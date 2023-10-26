public class Tank implements CustomComparable {
    private double hp;
    public Tank(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Tank) {
            Tank tank = (Tank) o;
            if (this.hp > tank.hp) {
                return 1;
            }
            if (this.hp < tank.hp) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public double getData() {
        return hp;
    }
}
