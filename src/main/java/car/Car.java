package car;

public class Car implements CarImpl{

    private double distancePerLiter;

    public Car(double distancePerLiter) {
        this.distancePerLiter = distancePerLiter;
    }

    @Override
    public double fuelCalculateByDistance(double distance) {
        return distance/this.distancePerLiter;
    }
}
