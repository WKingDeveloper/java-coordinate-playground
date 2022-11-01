package coordinate.model;

public class Line extends Figure {

    public Line(Points points) {
        super(points);
    }

    @Override
    public double calculate() {
        return Calculator.calculateLineLength(this.getPoints().points.get(0), this.getPoints().points.get(1));
    }

}
