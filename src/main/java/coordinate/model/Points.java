package coordinate.model;

import java.util.ArrayList;
import java.util.List;

public class Points {

    List<Point> points = new ArrayList<>();

    public void add(Point point) {
        this.points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }
}
