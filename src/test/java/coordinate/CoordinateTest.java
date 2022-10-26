package coordinate;

import coordinate.model.Coordinate;
import coordinate.model.Coordinates;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @CsvSource(value = {"(10,10)-(14,15)/ 10/ 10/ 14/ 15","(11,13)-(8,6)/ 11/ 13/ 8/ 6"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("입력받은 문자열을 통해 좌표 리스트 만들기")
    void splitCoordinates(String input, int x1, int y1, int x2, int y2) {
        Coordinate coordinate1 = new Coordinate(x1, y1);
        Coordinate coordinate2 = new Coordinate(x2, y2);
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(input);
        assertThat(coordinates.getCoordinateList())
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(coordinate1, coordinate2));
    }


}
