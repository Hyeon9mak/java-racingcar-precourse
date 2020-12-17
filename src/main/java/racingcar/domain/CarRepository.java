package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarRepository {

    private final List<Car> cars;

    private CarRepository(List<Car> cars) {
        validateDuplicate(cars);
        this.cars = cars;
    }

    public static CarRepository newParticipations(List<Car> cars) {
        return new CarRepository(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    private void validateDuplicate(List<Car> cars) {
        Set<String> carNames = new HashSet<>();
        cars.stream().forEach(car -> carNames.add(car.getName()));
        if (carNames.size() != cars.size()) {
            throw new IllegalArgumentException("참가 자동차 이름이 중복되면 안됩니다.");
        }
    }
}
