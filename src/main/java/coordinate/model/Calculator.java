package coordinate.model;

import java.util.*;
import java.util.stream.Collectors;

public class Calculator {
    public double calculate(Coordinates coordinates) {
        if (coordinates.isSquare()) {
            return calculateSquareArea(coordinates);
        }

        if (coordinates.isTriAngle()) {
            return calculateTriangleArea(coordinates);
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

    private double calculateTriangleArea(Coordinates coordinates) {
        double length1 = calculateLineLength(coordinates.getCoordinateList().get(0), coordinates.getCoordinateList().get(1));
        double length2 = calculateLineLength(coordinates.getCoordinateList().get(0), coordinates.getCoordinateList().get(2));
        double length3 = calculateLineLength(coordinates.getCoordinateList().get(1), coordinates.getCoordinateList().get(2));

        double s = (length1+length2+length3)/2;


        return Math.sqrt(s*(s-length1)*(s-length2)*(s-length3));
    }


}

