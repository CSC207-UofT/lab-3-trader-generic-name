/** This class represents a cow.
 * @author
 * @version 1
 */
public class Cow implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Cow() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "Moo!";
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

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
