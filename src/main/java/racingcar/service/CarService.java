package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarRepository;
import racingcar.view.GameView;
import racingcar.view.UserInput;

public class CarService {

    private static final String COMMA = ",";

    public static CarRepository participationCars() {
        while(true){
            try{
                return participationCarsWithValidate();
            } catch (IllegalArgumentException e){
                GameView.printError(e.getMessage());
            }
        }
    }

    private static CarRepository participationCarsWithValidate() {
        List<Car> participationCars = new ArrayList<>();
        String participationNames = UserInput.getParticipationCars();
        validateComma(participationNames);
        for (String name : participationNames.split(",")) {
            participationCars.add(Car.participationCarWithName(name));
        }
        return CarRepository.newParticipations(participationCars);
    }

    private static void validateComma(String participationNames) {
        if (participationNames.endsWith(COMMA)){
            throw new IllegalArgumentException("각 자동차 이름은 1~5자 사이여야 합니다.");
        }
    }
}
