package car;

public class Sonata extends Car {

    private double distancePerLiter = 10;
    private String name = "Sonata";

    Sonata(double distance) {
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
