package coordinate.view;

import coordinate.model.Figure;

public class ResultView {

    public void Result(double result, Figure figure) {
        if (figure == Figure.SQUARE) {
            System.out.println("사각형의 넓이 : " + (int) result);
            return;
        }

        if (figure == Figure.TRIANGLE) {
            System.out.printf("삼각형 넓이 : %.1f" , result);
            return;
        }

        System.out.println("두 점 사이의 거리 : " + result);
    }
}
