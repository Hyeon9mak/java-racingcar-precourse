package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testParticipationCar() {
        final String CAR_NAME = "pobi";
        Car car = Car.participationCarWithName(CAR_NAME);
        assertThat(car.getName()).isEqualTo(CAR_NAME);
    }

}
