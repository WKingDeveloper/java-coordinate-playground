package coordinate.model;

public class Line {
    private Points points;
    public Line(Points points) {
        this.points = points;
    }

    public double calculateLineLength() {
        Point point1 = this.points.getPoints().get(0);
        Point point2 = this.points.getPoints().get(1);
        int x = point1.getPositionX() - point2.getPositionX();
        int y = point1.getPositionY() - point2.getPositionY();
        return Math.sqrt(x * x + y * y);
    }
}
