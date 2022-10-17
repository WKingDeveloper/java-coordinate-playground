package car;

public abstract class Car{

    private double distance = 0;


    public Car(double distance) {
        this.distance = distance;
    }

    public double fuelCalculateByDistance() {
        return getDistance()/getDistancePerLiter();
    }

    public double getDistance() {
        return this.distance;
    }

    abstract double getDistancePerLiter();

    abstract String getName();

}
