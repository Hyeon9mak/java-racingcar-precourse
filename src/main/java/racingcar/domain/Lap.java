package racingcar.domain;

public class Lap {

    private static final int END_LAP = 0;
    private static final int MINIMUM_RANGE = 1;
    private static final int MAXIMUM_RANGE = 2147483646;

    private int lap;

    private Lap(int lap) {
        validateNumberRange(lap);
        this.lap = lap;
    }

    public static Lap newLap(int lap) {
        return new Lap(lap);
    }

    private void validateNumberRange(int lap) {
        if (lap < MINIMUM_RANGE || MAXIMUM_RANGE < lap) {
            throw new IllegalArgumentException("가능한 시도 회수 범위를 벗어났습니다.");
        }
    }

    public int getLap() {
        return lap;
    }

    public boolean isEnd(){
        if (lap == END_LAP){
            return true;
        }
        lap--;
        return false;
    }
}
