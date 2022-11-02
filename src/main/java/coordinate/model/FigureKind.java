package coordinate.model;

import java.util.Arrays;
import java.util.function.Function;

public enum FigureKind {


    LINE(2, (points) -> Calculator.calculateLineLength(points.getPoints().get(0), points.getPoints().get(1))),
    TRIANGLE(3, (points) -> Calculator.calculateTriangleArea(points)),
    SQUARE(4, (points) -> Calculator.calculateSquareArea(points));

    private final Integer size;
    private final Function<Points, Double> expression;

    FigureKind(Integer mark, Function<Points, Double> expression) {
        this.size = mark;
        this.expression = expression;
    }

    public static FigureKind findByInputMark(Integer mark) {
        return Arrays.stream(FigureKind.values())
                .filter(figureKind -> figureKind.getSize().equals(mark))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }

    public Double calculate(Points points) {
        return expression.apply(points);
    }

    public Integer getSize() {
        return size;
    }


}
