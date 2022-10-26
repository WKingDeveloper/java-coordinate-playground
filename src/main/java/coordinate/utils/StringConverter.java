package coordinate.utils;

public class StringConverter {


    public Integer[] coordinateToIntegerArrays(String input) {
        input = input.replace("(", "");
        input = input.replace(")", "");
        String[] inputs = input.split(",");
        Integer.valueOf(Integer.valueOf(inputs[0]));

        Integer[] result = {Integer.valueOf(inputs[0]), Integer.valueOf(inputs[1])};
        return result;
    }
}
