package coordinate.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Coordinates {

    Figure figure;
    List<Coordinate> coordinateList = new ArrayList<>();


    public List<Coordinate> setCoordinates(String input) {
        this.coordinateList = new ArrayList<>();
        String[] splitInputs = input.split("-");
        for (int i = 0; i<splitInputs.length; i++) {
            Coordinate coordinate = new Coordinate();
            coordinate = coordinate.setCoordinate(splitInputs[i]);
            this.coordinateList.add(coordinate);
        }
        setFigure();
        validRectangle();
        return this.coordinateList;
    }

    public List<Coordinate> getCoordinateList() {
        return coordinateList;
    }

    public Figure getFigure() {
        return figure;
    }

    private void setFigure() {
        this.figure = Figure.LINE;
        if (this.coordinateList.size() == 4) {
            this.figure = Figure.SQUARE;
        }
    }

    private void validRectangle() {
        if (isSquare()) {
            HashSet<Integer> list = new HashSet<>();
            this.coordinateList.stream().forEach(coordinate ->{
                    list.add(coordinate.getPositionX());
                    list.add(coordinate.getPositionY());
            });
            if (list.size() != 3) {
                throw new RuntimeException("직사각형이 아닙니다.");
            }
        }
    }

    public boolean isSquare() {
        return this.figure == Figure.SQUARE;
    }
}
