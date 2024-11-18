package variable;

import java.util.Arrays;
import java.util.List;

public class Keyword {

    public static void main(String[] args) {
        long number1 = 10L; // (1) 가변
        final long number2 = 10L; // (2) 불변

        number1 = 15L;
//        number2 = 20L; 컴파일 에러

        Long number3 = 1_000L; // (3)
        Person person = new Person("김영재"); // (4)

        final List<Integer> numbers = Arrays.asList(1, 2);
        // 컬렉션 자체는 불변이지만, 컬렉션 내부의 요소는 가변일 수 있음
//        numbers = List.of(1, 2, 3); 컴파일 에러
        numbers.add(3);
        System.out.println(numbers);

//        int n = null; 원시 타입 변수는 null을 가질 수 없음
        Integer n = null; // 참조 타입 변수는 null을 가질 수 있음
    }

}
