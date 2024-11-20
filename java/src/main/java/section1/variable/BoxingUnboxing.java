package section1.variable;

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
    }
}
