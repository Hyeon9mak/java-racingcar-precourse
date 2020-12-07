package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class InputUtilsTest {

    // 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.
    // 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    private final String COMMA = ",";
    private final int MAX_LENGTH = 5;
    private final String userNames = "ddffffd,pobi,jun,wrak,123456,asdfasfdasfd,assd  ";
    private final String secondUserNames = "ddff,pobi,jun,wrak,12346,fd,  ";

    @Test
    public void testUserInputException() {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(userNames.split(COMMA)));
        ArrayList<String> wrong_names = new ArrayList<String>();

        for (String name : names) {
            if (name.length() > MAX_LENGTH) {
                wrong_names.add(name);
            }
        }

        if (wrong_names.size() > 0) {
            System.out.println("[ERROR] 각 이름은 5자 이하여야 한다. -> " + wrong_names);
        }

        System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
    }

    @Test
    public void testInputUtils() {
        Scanner scanner = new Scanner(System.in);
    }

}
