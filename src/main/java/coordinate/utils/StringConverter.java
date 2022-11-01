package coordinate.utils;

import coordinate.model.Point;
import coordinate.model.Points;

public class StringConverter {


    public static Points stringToPoints(String input) {
        Points points = new Points();
        String[] splitInputs = input.split("-");
        for (int i = 0; i<splitInputs.length; i++) {
            Integer[] coordinate = removeParentheses(splitInputs[i]);
            points.add(new Point(coordinate[0],coordinate[1]));
        }
        return points;
    }

    private static Integer[] removeParentheses(String input) {
        input = input.replace("(", "");
        input = input.replace(")", "");
        String[] inputs = input.split(",");
        Integer[] result = {Integer.valueOf(inputs[0]), Integer.valueOf(inputs[1])};
        return result;
    }
}
