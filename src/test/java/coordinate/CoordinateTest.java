package coordinate;

import coordinate.model.Calculator;
import coordinate.model.Coordinate;
import coordinate.model.Coordinates;
import coordinate.model.Figure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class CoordinateTest {

    @CsvSource(value = {"(10,10)-(14,15)/ 10/ 10/ 14/ 15",
            "(11,13)-(8,6)/ 11/ 13/ 8/ 6"},
            delimiterString = "/")
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

    @CsvSource(value = {"10/ -1","11/ 26"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("좌표 범위 에러 테스트")
    void validCoordinates(int x1, int y1) {
        Coordinate coordinate = new Coordinate();
        Throwable thrown = catchThrowable(() -> {
            coordinate.setPositions(x1,y1);
        });
        assertThat(thrown).isInstanceOf(RuntimeException.class);
    }

    @CsvSource(value = {"(10,10)-(14,15)/ 6.403124"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("직선 길이 구하기 테스트")
    void calculateLineLengthTest(String input, double length) {
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(input);
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate(coordinates))
                .isEqualTo(length, offset(0.000099));
    }

    @CsvSource(value = {"(10,10)-(14,15)/ LINE","(10,10)-(22,10)-(22,18)-(10,18)/ SQUARE"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("입력받은 문자열이 어떤 도형인지 판별")
    void distinguishFigure(String input, String figure) {
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(input);
        assertThat(coordinates.getFigure()).isEqualTo(Figure.valueOf(figure));
    }

    @CsvSource(value = {"(10,10)-(22,10)-(22,18)-(10,16)", "(8,10)-(22,10)-(20,18)-(10,18)"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("사각형의 모양이 직사각형인지 확인")
    void validRectangle(String input) {
        Coordinates coordinates = new Coordinates();
        Throwable throwable = catchThrowable(()->{
            coordinates.setCoordinates(input);
        });
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @CsvSource(value = {"(10,10)-(22,10)-(22,18)-(10,18)/ 96"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("직사각형 넓이 구하기 테스트")
    void calculateSquareArea(String input, double area) {
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(input);
        Calculator calculator = new Calculator();
        assertThat(calculator.calculate(coordinates))
                .isEqualTo(area);
    }

    @CsvSource(value = {"((10,10)-(14,15)-(20,8)/ TRIANGLE"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("좌표가 3개 입력되었을 때 모양이 삼각형인지 테스트")
    void validTriangle(String input, String figure) {
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(input);

        assertThat(coordinates.getFigure()).isEqualTo(Figure.valueOf(figure));
    }
}
