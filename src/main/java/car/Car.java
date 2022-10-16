package car;

public abstract class Car {

    private double distancePerLiter;

    public Car(double distancePerLiter) {
        this.distancePerLiter = distancePerLiter;
    }

    double fuelCalculateByDistance(double distance){
        return distance/this.distancePerLiter;
    }
}
