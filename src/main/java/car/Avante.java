package car;

public class Avante extends Car {

    private double distancePerLiter = 15;
    private String name = "Avante";

    Avante(double distance) {
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
