package variable;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {

    public static void main(String[] args) {
        // reference type
        Long startBoxing = System.currentTimeMillis();
        Long sumReference = 0L;
        for (Long i = 0L; i < 1000000L; i++) {
            sumReference += i; // boxing unboxing
        }
        long endBoxing = System.currentTimeMillis();
        System.out.println("참조 타입 실행 시간: " + (endBoxing - startBoxing) + " ms");

        // primitive type
        long startPrimitive = System.currentTimeMillis();
        long sumPrimitive = 0L;
        for (long i = 0; i < 1000000; i++) {
            sumPrimitive += i;
        }
        long endPrimitive = System.currentTimeMillis();
        System.out.println("원시 타입 실행 시간: " + (endPrimitive - startPrimitive) + " ms");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 오토박싱: int → Integer
        numbers.add(20);

        for (Integer num : numbers) {
            System.out.println(num); // 언박싱: Integer → int
        }

        int primitive = 10;
        Integer boxed = Integer.valueOf(primitive); // 명시적 박싱
        int unboxed = boxed.intValue(); // 명시적 언박싱
    }
}
