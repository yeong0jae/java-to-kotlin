package section2.function;

public class Function {

    public static void main(String[] args) {
        printAll("A", "B", "C");
        String[] strings = {"A", "B", "C"};
        printAll(strings);
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) { // overloading
        repeat(str, num, true);
    }

    public void repeat(String str) { // overloading
        repeat(str, 3, true);
    }

    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
