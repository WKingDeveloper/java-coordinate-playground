package coordinate;

import coordinate.model.Figure;
import coordinate.model.Points;
import coordinate.utils.StringConverter;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateCalculator {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Points points = null;
        Figure figure = null;
        boolean isValidCoordinate = true;
        while (isValidCoordinate){
            String pointsToString = inputView.init();
            try {
                points = StringConverter.stringToPoints(pointsToString);
//                figure = FigureFactory.create(points);
                figure = new Figure(points);
                isValidCoordinate = false;
            } catch (RuntimeException e) {
                resultView.validFailInputCoordinate();
            }
        }
        double result = figure.calculate();
        resultView.Result(result,figure.getClass().getSimpleName());
    }

}
