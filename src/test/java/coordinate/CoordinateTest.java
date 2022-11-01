package coordinate;

import coordinate.model.*;
import coordinate.utils.StringConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class CoordinateTest {


    @CsvSource(value = {"(10,10)-(14,15)/ 10/ 10/ 14/ 15",
            "(11,13)-(8,6)/ 11/ 13/ 8/ 6"},
            delimiterString = "/")
    @ParameterizedTest
    @DisplayName("입력받은 문자열 Point List로 파싱")
    void inputParsing(String input, int x1, int y1, int x2, int y2) {
        Points points = StringConverter.stringToPoints(input);
        Points validPoints = new Points();
        validPoints.add(new Point(x1, y1));
        validPoints.add(new Point(x2, y2));
        assertThat(points)
                .usingRecursiveComparison()
                .isEqualTo(validPoints);
    }


    @CsvSource(value = {"-1","25"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("좌표 범위 에러 테스트")
    void validPoints(int x) {
        Throwable thrown = catchThrowable(() -> {
            Coordinate coordinate = new Coordinate(x);
        });
        assertThat(thrown).isInstanceOf(RuntimeException.class);
    }

    @CsvSource(value = {"10/ 10/ 14/ 15/ 6.403124"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("직선 길이 구하기 테스트")
    void calculateLineLengthTest(int x1, int y1, int x2, int y2, double length) {
        Points points = new Points();
        points.add(new Point(x1,y1));
        points.add(new Point(x2,y2));
        Line line = new Line(points);
        assertThat(line.calculate())
                .isEqualTo(length, offset(0.000099));
    }


    @CsvSource(value = {"10/ 10/ 22/ 10/ 22/ 18/ 10/ 16","8/ 10/ 22/ 10/ 20/ 18/ 10/ 18"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("사각형의 모양이 직사각형인지 확인")
    void validRectangle(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4) {
        Points points = new Points();
        points.add(new Point(x1,y1));
        points.add(new Point(x2,y2));
        points.add(new Point(x3,y3));
        points.add(new Point(x4,y4));

        Throwable throwable = catchThrowable(()->{
            Square square = new Square(points);
        });
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @CsvSource(value = {"10/ 10/ 22/ 10/ 22/ 18/ 10/ 18/ 96"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("직사각형 넓이 구하기 테스트")
    void calculateSquareArea(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4, double area) {
        Points points = new Points();
        points.add(new Point(x1,y1));
        points.add(new Point(x2,y2));
        points.add(new Point(x3,y3));
        points.add(new Point(x4,y4));

        Square square = new Square(points);
        assertThat(square.calculate())
                .isEqualTo(area);
    }


    @CsvSource(value = {"10/ 10/ 14/ 15/ 20/ 8/ 29.0"}, delimiterString = "/")
    @ParameterizedTest
    @DisplayName("삼각형 넓이 구하기 테스트")
    void calculateTriangleArea(int x1, int y1, int x2, int y2,int x3, int y3, double area) {
        Points points = new Points();
        points.add(new Point(x1,y1));
        points.add(new Point(x2,y2));
        points.add(new Point(x3,y3));
        Triangle triangle = new Triangle(points);
        assertThat(triangle.calculate())
                .isEqualTo(area,offset(0.99));
    }


}
