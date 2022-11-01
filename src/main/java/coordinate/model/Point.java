package coordinate.model;

public class Point {

    private Position positionX;
    private Position positionY;

    public Point(int x, int y) {
        this.positionX = new Position(x);
        this.positionY = new Position(y);
    }

    public int getPositionX() {
        return positionX.getPosition();
    }

    public int getPositionY() {
        return positionY.getPosition();
    }
}
