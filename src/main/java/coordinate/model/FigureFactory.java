package coordinate.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private static Map<Integer, Function<Points, Figure>> optimizer = new HashMap<>();

    static {
        optimizer.put(2, Line::new);
        optimizer.put(3, Triangle::new);
        optimizer.put(4, Square::new);
    }

    public static Figure create(Points points) {

        return classifireFigure(points);

    }

    static Figure classifireFigure(Points points) {
        return optimizer.get(points.getPoints().size()).apply(points);
    }


}
