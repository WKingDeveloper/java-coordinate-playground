package car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FuelCalculator {

    @Test
    @DisplayName("소나타 필요 연료 계산")
    void fuelCalculateByDistanceFromSonata(){
        Car car = new Sonata(20);
        double result = car.fuelCalculateByDistance();
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("아반떼 필요 연료 계산")
    void fuelCalculateByDistanceFromAvante(){
        Car car = new Avante(30);
        double result = car.fuelCalculateByDistance();
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("K5 필요 연료 계산")
    void fuelCalculateByDistanceFromK5(){
        Car car = new K5(26);
        double result = car.fuelCalculateByDistance();
        assertThat(result).isEqualTo(2);
    }

}
