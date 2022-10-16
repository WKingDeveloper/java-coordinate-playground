package car;

public class K5 extends Car {

    private double distancePerLiter = 13;
    private double distance;

    K5(double distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

}
