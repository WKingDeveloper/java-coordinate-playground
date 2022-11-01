package coordinate.view;

public class ResultView {

    public void Result(double result, String className) {
        System.out.println(className + " : " + result);
    }

    public void validFailInputCoordinate() {
        System.out.println("올바르지 않은 좌표를 입력하였습니다.");
    }

}
