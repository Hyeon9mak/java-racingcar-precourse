package racingcar;

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
        GameView.printEnterLine();
        GameView.printRaceStart();
        racing(racer, lap);
    }

    private void racing(CarRepository racer, Lap lap) {
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
