package oop.clas.validation;

public class Ball {

    public static final int MIN_BALL_NUMBER = 1;
    public static final int MAX_BALL_NUMBER = 45;

    private final int number;

    public Ball(int number) {
        validate(number);
        this.number = number;
    }

    private void validate(int number) {
        if (number < MIN_BALL_NUMBER || number > MAX_BALL_NUMBER) {
            throw new IllegalArgumentException("숫자는 1부터 45까지 가능합니다");
        }
    }

}
