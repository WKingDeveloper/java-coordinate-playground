package coordinate.model;

public class Triangle extends Figure{

    public Triangle(Points points) {
        super(points);
    }

    @Override
    public double calculate() {
        return Calculator.calculateTriangleArea(super.getPoints());
    }
}
