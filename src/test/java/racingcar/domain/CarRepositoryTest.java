package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarRepositoryTest {

    @Test
    public void testAddCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.participationCarWithName("pobi"));
        cars.add(Car.participationCarWithName("woni"));
        cars.add(Car.participationCarWithName("jun"));
        CarRepository carRepository = CarRepository.newParticipations(cars);
        assertThat(carRepository.getCars()).isNotEmpty();
    }

}
