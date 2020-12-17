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

    @Test
    public void testCarMoveForward(){
        final String CAR_NAME1 = "pobi";
        //final String CAR_NAME2 = "woni";
        //final String CAR_NAME3 = "jun";
        Car car1 = Car.participationCarWithName(CAR_NAME1);
        //Car car2 = Car.participationCarWithName(CAR_NAME2);
        //Car car3 = Car.participationCarWithName(CAR_NAME3);

        car1.moveForward();
        car1.moveForward();
        car1.moveForward();
        assertThat(car1.getPosition()).isBetween(0,3);

    }

}
