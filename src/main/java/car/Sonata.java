package car;

public class Sonata extends Car {

    private double distancePerLiter = 10;
    private double distance;

    Sonata(double distance) {
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
