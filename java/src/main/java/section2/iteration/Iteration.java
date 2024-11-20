package section2.iteration;

import java.util.Arrays;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {

    }

    private void listIteration() {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }
    }

    private void basicFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
