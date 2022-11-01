package coordinate;

import coordinate.model.Calculator;
import coordinate.model.Points;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateCalculator {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Points points = new Points();
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator();
        Calculator calculator = new Calculator();

        boolean isValidCoordinate = true;
        while (isValidCoordinate){
            String pointsToString = inputView.init();
            isValidCoordinate = coordinateCalculator.runGame(points, pointsToString);
        }

//        double result = calculator.calculate(points);
//        resultView.Result(result,points.getFigure());
    }

    private boolean runGame(Points points, String input) {
        try {
//            points.setPoints(input);
            return false;
        } catch (RuntimeException e) {
            return true;
        }
    }
}
