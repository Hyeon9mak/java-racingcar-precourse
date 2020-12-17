package racingcar.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarRepository;
import racingcar.view.GameView;
import racingcar.view.UserInput;

public class CarService {

    private static final String COMMA = ",";
    private static final String DASH = "-";

    public static String getCarPosition(Car car) {
        StringBuilder stringBuilder = new StringBuilder();
        int position = car.getPosition();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(DASH);
        }
        return stringBuilder.toString();
    }

    public static CarRepository getParticipationCars() {
        while (true) {
            try {
                return participationWithValidate();
            } catch (IllegalArgumentException e) {
                GameView.printError(e.getMessage());
            }
        }
    }

    private static CarRepository participationWithValidate() {
        String participationNames = UserInput.getParticipationCars();
        validateComma(participationNames);
        List<Car> participationCars = new ArrayList<>();
        for (String name : participationNames.split(",")) {
            participationCars.add(Car.participationCarWithName(name));
        }
        return CarRepository.newParticipations(participationCars);
    }

    private static void validateComma(String participationNames) {
        if (participationNames.endsWith(COMMA)) {
            throw new IllegalArgumentException("각 자동차 이름은 1~5자 사이여야 합니다.");
        }
    }

    public static List<String> getWinnerNames(CarRepository racer) {
        int maxDistance = getMaxDistance(racer);
        List<String> winnerNames = new ArrayList<>();
        racer.getCars().stream().filter(car -> car.getPosition() == maxDistance)
            .forEach(car -> winnerNames.add(car.getName()));
        return winnerNames;
    }

    private static int getMaxDistance(CarRepository racer) {
        return racer.getCars().stream()
            .max(Comparator.comparingInt(Car::getPosition))
            .get().getPosition();
    }
}
