package racingcar.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void testParticipationCar() {
        assertThat(CarService.participationCars()).isNotNull();
    }

}
