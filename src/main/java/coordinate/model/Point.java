package coordinate.model;

public class Point {

    private Coordinate coordinateX;
    private Coordinate coordinateY;

    public Point(int x, int y) {
        this.coordinateX = new Coordinate(x);
        this.coordinateY = new Coordinate(y);
    }

    public int getPositionX() {
        return coordinateX.getPosition();
    }

    public int getPositionY() {
        return coordinateY.getPosition();
    }
}
