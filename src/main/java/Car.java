public class Car implements Tradable, Drivable {
    private int maxSpeed;
    private final int price;

    public Car(int maxSpeed, int price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
