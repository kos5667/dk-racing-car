import level3.Car;

public class Racing {

    public static void main(String[] args) {
        Car car = new Car();

        // 자동차 대수
        car.setCars();
        // 시도할 횟수
        car.setTry();

        // Racing Start
        car.racing();
    }
}
