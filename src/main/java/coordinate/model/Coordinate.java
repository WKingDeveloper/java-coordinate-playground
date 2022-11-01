package coordinate.model;

public class Coordinate {

    private int position;

    public Coordinate(int position) {
        if (position < 0 || position > 24) {
            throw new RuntimeException("좌표 범위가 올바르지 않습니다.");
        }
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
