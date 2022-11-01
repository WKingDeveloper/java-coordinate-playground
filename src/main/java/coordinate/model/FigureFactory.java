package coordinate.model;

public class FigureFactory {

    public static Figure create(Points points) {
        if (points.getPoints().size() == 3) {
            return new Triangle(points);
        }

        if (points.getPoints().size() == 4) {
            return new Square(points);
        }

        return new Line(points);
    }


}
