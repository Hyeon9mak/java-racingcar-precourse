package racingcar;

import racingcar.service.CarService;
import racingcar.service.LapService;

public class RacingCarGame {

    private RacingCarGame(){
    }

    public static RacingCarGame newRacingCarGame() {
        return new RacingCarGame();
    }

    public void start(){
        CarService.getParticipationCars();
        LapService.getRacingLap();
    }
}
