package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarRepository;
import racingcar.view.UserInput;

public class CarService {

    public static CarRepository participationCars() {
        List<Car> participationCars = new ArrayList<>();
        String participationNames = UserInput.getParticipationCars();
        for (String name : participationNames.split(",")) {
            participationCars.add(Car.participationCarWithName(name));
        }
        return CarRepository.newParticipations(participationCars);
    }
}
