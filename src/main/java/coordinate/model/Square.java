package coordinate.model;

import java.util.HashSet;

public class Square {

    private Points points;
    public Square(Points points) {
        validRectangle();
        this.points = points;
    }

    public double calculateLineLength() {
        return 2;
    }

    private void validRectangle() {

        HashSet<Integer> list = new HashSet<>();
        this.points.getPoints().stream().forEach(coordinate ->{
            list.add(coordinate.getPositionX());
            list.add(coordinate.getPositionY());
        });
        if (list.size() != 3) {
            throw new RuntimeException("직사각형이 아닙니다.");
        }

    }


}
