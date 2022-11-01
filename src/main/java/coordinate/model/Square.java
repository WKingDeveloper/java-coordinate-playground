package coordinate.model;

import java.util.HashSet;

public class Square extends Figure {

    public Square(Points points) {
        super(points);
        validRectangle();
    }

    @Override
    public double calculate() {
        return Calculator.calculateSquareArea(super.getPoints());
    }


    private void validRectangle() {

        HashSet<Integer> list = new HashSet<>();
        super.getPoints().points.stream().forEach(coordinate ->{
            list.add(coordinate.getPositionX());
            list.add(coordinate.getPositionY());
        });
        if (list.size() != 3) {
            throw new RuntimeException("직사각형이 아닙니다.");
        }

    }


}
