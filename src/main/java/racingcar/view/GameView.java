package racingcar.view;

public class GameView {

    private static final String ERROR_PREFIX = "[ERROR] ";

    public static void printError(String message) {
        System.out.println(ERROR_PREFIX + message);
        System.out.println();
    }
}
