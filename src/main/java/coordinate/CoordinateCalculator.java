package coordinate;

import coordinate.model.Calculator;
import coordinate.model.Coordinates;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateCalculator {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Coordinates coordinates = new Coordinates();
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator();
        Calculator calculator = new Calculator();

        boolean isValidCoordinate = true;
        while (isValidCoordinate){
            String coordinatesToString = inputView.init();
            isValidCoordinate = coordinateCalculator.runGame(coordinates, coordinatesToString);
        }

        double result = calculator.calculate(coordinates);
        resultView.Result(result,coordinates.getFigure());
    }

    private boolean runGame(Coordinates coordinates, String input) {
        try {
            coordinates.setCoordinates(input);
            return false;
        } catch (RuntimeException e) {
            return true;
        }
    }
}
