package coordinate.model;

import coordinate.utils.StringConverter;

public class Coordinate {

    private Position positionX;
    private Position positionY;

    public Coordinate() {
    }

    public Coordinate(int positionX, int positionY) {
        this.positionX = new Position(positionX);
        this.positionY = new Position(positionY);
    }

    public Coordinate setCoordinate(String input) {

        StringConverter stringConverter = new StringConverter();
        Integer[] coordinate = stringConverter.coordinateToIntegerArrays(input);

        this.positionX = new Position(coordinate[0]);
        this.positionY = new Position(coordinate[1]);

        return this;
    }

    public void setPositions(int positionX, int positionY) {
        this.positionX = new Position(positionX);
        this.positionY = new Position(positionY);
    }

    public double calculateLineLength(Coordinate c1, Coordinate c2) {
        int x = c1.positionX.getPosition() - c2.positionX.getPosition();
        int y = c1.positionY.getPosition() - c2.positionY.getPosition();
        return Math.sqrt(x * x + y * y);

    }
}

