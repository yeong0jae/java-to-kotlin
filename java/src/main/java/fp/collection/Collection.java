package fp.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

    public static void main(String[] args) {

    }

    private static void listEx() {
        final List<Integer> numbers = Arrays.asList(100, 200);

        System.out.println(numbers.get(0));

        // for each
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s", i, numbers.get(i));
        }
    }

    private static void mapEx() {

        //jdk 8
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");

        //jdk 9
        Map.of(1, "Monday", 2, "Tuesday");

        for (int key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}

