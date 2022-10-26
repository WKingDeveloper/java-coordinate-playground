package coordinate.model;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    List<Coordinate> coordinateList = new ArrayList<>();


    public List<Coordinate> setCoordinates(String input) {
        this.coordinateList = new ArrayList<>();
        String[] splitInputs = input.split("-");
        for (int i = 0; i<splitInputs.length; i++) {
            Coordinate coordinate = new Coordinate();
            coordinate = coordinate.setCoordinate(splitInputs[i]);
            this.coordinateList.add(coordinate);
        }
        return this.coordinateList;
    }

    public List<Coordinate> getCoordinateList() {
        return coordinateList;
    }

}
