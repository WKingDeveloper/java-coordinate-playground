package car;

public class Car implements CarImpl{

    private double distance;


    public Car(double distance) {
        this.distance = distance;
    }


    @Override
    public double fuelCalculateByDistance() {
        return getDistance()/getDistancePerLiter();
    }

    @Override
    public double getDistance() {
        return this.distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 0;
    }

    @Override
    public String getName() {
        return "car";
    }
}
