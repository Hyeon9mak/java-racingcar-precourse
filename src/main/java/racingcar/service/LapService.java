package racingcar.service;

import racingcar.domain.Lap;
import racingcar.view.GameView;
import racingcar.view.UserInput;

public class LapService {

    public static Lap getRacingLap() {
        while (true) {
            try {
                return getLapWithValidate();
            } catch (IllegalArgumentException e) {
                GameView.printError(e.getMessage());
            }
        }
    }

    private static Lap getLapWithValidate() {
        int lap = validateInteger(UserInput.getRacingLap());
        return Lap.newLap(lap);
    }

    private static int validateInteger(String lap) {
        try {
            return Integer.parseInt(lap);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("시도 회수는 정수만 입력 가능합니다.");
        }
    }
}
