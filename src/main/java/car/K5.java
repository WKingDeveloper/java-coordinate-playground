package car;

public class K5 extends Car {
    private double distancePerLiter = 13;
    private String name = "K5";

    K5(double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
