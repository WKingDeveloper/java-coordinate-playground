package coordinate.view;

import java.util.Scanner;

public class InputView {


    Scanner scanner = new Scanner(System.in);

    public String init() {
        System.out.println("좌표를 입력하세요");
        String value = scanner.nextLine();
        return value;
    }

}
