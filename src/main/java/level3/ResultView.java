package level3;

public class ResultView {

    private final static String CAR = "-";

    public static void moveForward(int n) {
        for(int i=0; i<n; i++)
            System.out.print(CAR);
    }
}
