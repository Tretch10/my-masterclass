package masterclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Testing {

    static List<Integer> scores = Arrays.asList(12, 6, 7, 4, 8, 16);
    public static void main(String[] args) {

        scores.stream().sorted()
                .forEach(System.out::println);
    }
}
