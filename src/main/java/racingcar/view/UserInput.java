package racingcar.view;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getParticipationCars() {
        System.out.println();
        return scanner.nextLine();
    }
}
