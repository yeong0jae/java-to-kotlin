package variable;

import java.util.List;

public class Keyword {

    public static void main(String[] args) {
        long number1 = 10L; // (1) 가변
        final long number2 = 10L; // (2) 불변

        Long number3 = 1_000L; // (3)
        Person person = new Person("김영재"); // (4)

        final List<Integer> numbers = List.of(1, 2);
        // 컬렉션 자체는 불변이지만, 컬렉션 내부의 요소는 가변일 수 있음

//        int n = null; 원시 타입 변수는 null을 가질 수 없음
        Integer n = null; // 참조 타입 변수는 null을 가질 수 있음
    }

}
