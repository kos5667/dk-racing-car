package level3;

import java.util.Random;

public class Car extends InputView {

    private static final Random random = new Random();
    private final static int CONDITION = 10;
    private final static int MV_FORWARD = 4;

    public void racing() {
        int[] attempts = new int[CARS];

        for(int i=0; i < TRY; i++) {
            for(int j=0; j < CARS; j++) {
                if (move(MV_FORWARD)) attempts[j]++;
//                ResultView.moveForward(attempts[j]);
                System.out.println(attempts[j]);
            }
            System.out.println();
        }

//        System.out.println(cars);
//        System.out.println(trys);
    }

    public void round(int n) {
        for(int i=0; i < n; i++) {
        }
    }

    public boolean move(int num) {
        return random.nextInt(CONDITION) >= MV_FORWARD;
    }
}
