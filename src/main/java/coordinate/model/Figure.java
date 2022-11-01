package coordinate.model;

public abstract class Figure {
    private Points points;

    public Figure(Points points) {
        this.points = points;
    }

    public abstract double calculate();

    public Points getPoints() {
        return points;
    }
}
