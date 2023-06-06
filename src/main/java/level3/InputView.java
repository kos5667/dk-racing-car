package level3;

import java.util.Scanner;

public class InputView {

    private final Scanner scan = new Scanner(System.in);
    public static int CARS = 0;
    public static int TRY = 0;

    public void setCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        CARS = scan.nextInt();
    }

    public void setTry() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        TRY = scan.nextInt();
    }
}
