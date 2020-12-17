package racingcar;

import org.junit.jupiter.api.Test;

public class RacingCarGameTest {

    @Test
    public void testStart() {
        RacingCarGame racingCarGame = RacingCarGame.newRacingCarGame();
        racingCarGame.start();
    }
}
