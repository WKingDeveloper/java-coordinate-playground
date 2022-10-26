package coordinate;

import coordinate.model.Calculator;
import coordinate.model.Coordinate;
import coordinate.model.Coordinates;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateCalculator {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Coordinates coordinates = new Coordinates();
        Coordinate coordinate = new Coordinate();
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator();
        Calculator calculator = new Calculator();

        boolean isValidCoordinate = true;
        while (isValidCoordinate){
            String coordinatesToString = inputView.init();
            isValidCoordinate = coordinateCalculator.runGame(coordinates, coordinatesToString);
        }


        double length = calculator.calculateLineLength(coordinates.getCoordinateList().get(0),
                coordinates.getCoordinateList().get(1));
        resultView.Result(length);
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
