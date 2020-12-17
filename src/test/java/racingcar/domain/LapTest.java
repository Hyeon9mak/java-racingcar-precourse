package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LapTest {

    @Test
    public void testCreateLap() {
        final int FIVE = 5;
        Lap lap = Lap.newLap(FIVE);
        assertThat(lap.getLap()).isEqualTo(FIVE);
    }

}
