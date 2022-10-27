package coordinate.model;

import java.util.*;
import java.util.stream.Collectors;

public class Calculator {
    public double calculate(Coordinates coordinates) {
        if (coordinates.isSquare()) {
            return calculateSquareArea(coordinates);
        }
        return calculateLineLength(coordinates.getCoordinateList().get(0),coordinates.getCoordinateList().get(1));
    }

    private double calculateLineLength(Coordinate c1, Coordinate c2) {
        int x = c1.getPositionX() - c2.getPositionX();
        int y = c1.getPositionY() - c2.getPositionY();
        return Math.sqrt(x * x + y * y);
    }

    private double calculateSquareArea(Coordinates coordinates) {
        List<Integer> xPositionList = new ArrayList<>();
        List<Integer> yPositionList = new ArrayList<>();
        coordinates.getCoordinateList().stream().forEach(coordinate ->{
            xPositionList.add(coordinate.getPositionX());
            yPositionList.add(coordinate.getPositionY());
        });
        xPositionList.sort(Comparator.reverseOrder());
        yPositionList.sort(Comparator.reverseOrder());
        return (xPositionList.get(0)-xPositionList.get(3)) * (yPositionList.get(0)-yPositionList.get(3));


    }


}

