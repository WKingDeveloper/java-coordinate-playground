package car;

public class Avante extends Car {

    private double distancePerLiter = 15;
    private double distance;

    Avante(double distance) {
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
