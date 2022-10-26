package coordinate.model;

public class Calculator {
    public double calculateLineLength(Coordinate c1, Coordinate c2) {
        int x = c1.getPositionX() - c2.getPositionX();
        int y = c1.getPositionY() - c2.getPositionY();
        return Math.sqrt(x * x + y * y);
    }
}
