package racingcar.domain;

import utils.RandomUtils;

public class GasTank {

    private static final int MINIMUM_GAS = 0;
    private static final int MAXIMUM_GAS = 9;
    private static final int ENOUGH_GAS = 4;

    public static boolean enoughGas() {
        return RandomUtils.nextInt(MINIMUM_GAS, MAXIMUM_GAS) >= ENOUGH_GAS;
    }
}
