package variable;

public class IntegerCache {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int a = 127;
        int b = 127;
        for (int i = 0; i < 10000000; i++) {
            Integer c = a + b;
        }
        System.out.println(System.currentTimeMillis() - t + " ms");

        long t2 = System.currentTimeMillis();
        int c = 128;
        int d = 128;
        for (int i = 0; i < 10000000; i++) {
            Integer e = c + d;
        }
        System.out.println(System.currentTimeMillis() - t2 + " ms");
    }
}
