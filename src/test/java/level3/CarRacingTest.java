package level3;

import level2.StringAddCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarRacingTest {

    private Car car;

    @BeforeEach
    public void setup() {
        car = new Car();
    }

    // TDD를 위해 메서드 분리? 
    @Test
    public void 이동_테스트() {
        // given
        // when
        // then

    }
}
