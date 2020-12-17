package racingcar.view;

import java.util.List;
import jdk.nashorn.internal.scripts.JO;

public class GameView {

    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String JOIN_WINNERS = ", ";

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

    public static void printWinners(List<String> winnerNames) {
        System.out.println("최종 우승자: " + String.join(JOIN_WINNERS, winnerNames));
    }
}
