package racingcar.domain;

public class Car {

    private static final String WHITE_SPACE = " ";
    private static final int MINIMUM_NAME_LENGTH = 1;
    private static final int MAXIMUM_NAME_LENGTH = 5;

    private final String name;
    private final int position = 0;

    public Car(String name) {
        validateWhiteSpace(name);
        validateLength(name);
        this.name = name;
    }

    public static Car participationCarWithName(String name) {
        return new Car(name);
    }

    public String getName() {
        return name;
    }

    private void validateLength(String name) {
        if (name.length() < MINIMUM_NAME_LENGTH || name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException("각 자동차 이름은 1~5자 사이여야 합니다.");
        }
    }

    private void validateWhiteSpace(String name) {
        if (name.contains(WHITE_SPACE)) {
            throw new IllegalArgumentException("이름에 공백이 포함될 수 없습니다.");
        }
    }
}
