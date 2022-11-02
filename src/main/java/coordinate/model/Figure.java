package coordinate.model;

public class Figure {
    private Points points;
    private FigureKind figureKind;

    public Figure(Points points) {
        this.points = points;

        if(points.getPoints().size() == 2) {
            this.figureKind = FigureKind.LINE;
        }

        if(points.getPoints().size() == 3) {
            this.figureKind = FigureKind.TRIANGLE;
        }

        if(points.getPoints().size() == 4) {
            this.figureKind = FigureKind.SQUARE;
        }

    }

    public double calculate() {
       return figureKind.calculate(this.points);
    }


    public Points getPoints() {
        return points;
    }

    public FigureKind getOperation() {
        return figureKind;
    }
}
