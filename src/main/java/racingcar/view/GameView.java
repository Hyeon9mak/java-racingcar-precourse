package racingcar.view;

public class GameView {

    private static final String ERROR_PREFIX = "[ERROR] ";

    public static void printError(String message) {
        System.out.println(ERROR_PREFIX + message);
        System.out.println();
    }

    public static void printRacing(String carName, String carPosition) {
        System.out.println(carName + " : " + carPosition);
    }

    public static void printEnterLine() {
        System.out.println();
    }

    public static void printRaceStart() {
        System.out.println("실행 결과");
    }
}
