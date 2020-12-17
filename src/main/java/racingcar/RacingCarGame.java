package racingcar;

import java.util.List;
import racingcar.domain.CarRepository;
import racingcar.domain.Lap;
import racingcar.service.CarService;
import racingcar.service.LapService;
import racingcar.view.GameView;

public class RacingCarGame {

    private RacingCarGame() {
    }

    public static RacingCarGame newRacingCarGame() {
        return new RacingCarGame();
    }

    public void start() {
        CarRepository racer = CarService.getParticipationCars();
        Lap lap = LapService.getRacingLap();
        racing(racer, lap);
        awardWinners(racer);
    }

    private void awardWinners(CarRepository racer) {
        List<String> winnerNames = CarService.getWinnerNames(racer);
        GameView.printWinners(winnerNames);
    }

    private void racing(CarRepository racer, Lap lap) {
        GameView.printEnterLine();
        GameView.printRaceStart();
        while (!lap.isEnd()) {
            oneLapRacing(racer);
            GameView.printEnterLine();
        }
    }

    private void oneLapRacing(CarRepository racer) {
        racer.getCars().stream().forEach(car -> {
            car.moveForward();
            GameView.printRacing(car.getName(), CarService.getCarPosition(car));
        });
    }
}
