package car;

public abstract class Car {

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();


    double fuelCalculateByDistance(){
        return getTripDistance()/getDistancePerLiter();
    }
}
