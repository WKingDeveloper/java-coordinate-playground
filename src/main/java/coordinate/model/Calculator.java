package coordinate.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Calculator {


    public static double calculateLineLength(Point c1, Point c2) {
        int x = c1.getPositionX() - c2.getPositionX();
        int y = c1.getPositionY() - c2.getPositionY();
        return Math.sqrt(x * x + y * y);
    }

    public static double calculateSquareArea(Points points) {
        List<Integer> xPositionList = new ArrayList<>();
        List<Integer> yPositionList = new ArrayList<>();
        points.getPoints().stream().forEach(coordinate ->{
            xPositionList.add(coordinate.getPositionX());
            yPositionList.add(coordinate.getPositionY());
        });
        xPositionList.sort(Comparator.reverseOrder());
        yPositionList.sort(Comparator.reverseOrder());
        return (xPositionList.get(0)-xPositionList.get(3)) * (yPositionList.get(0)-yPositionList.get(3));
    }

    public static double calculateTriangleArea(Points points) {
        double length1 = calculateLineLength(points.getPoints().get(0), points.getPoints().get(1));
        double length2 = calculateLineLength(points.getPoints().get(0), points.getPoints().get(2));
        double length3 = calculateLineLength(points.getPoints().get(1), points.getPoints().get(2));

        double s = (length1+length2+length3)/2;


        return Math.sqrt(s*(s-length1)*(s-length2)*(s-length3));
    }


}

