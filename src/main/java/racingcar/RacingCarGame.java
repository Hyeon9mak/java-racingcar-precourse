package racingcar;

import racingcar.service.CarService;

public class RacingCarGame {

    private RacingCarGame(){
    }

    public static RacingCarGame newRacingCarGame() {
        return new RacingCarGame();
    }

    public void start(){
        System.out.println(CarService.participationCars().getCars().size());
    }
}
