package newFeatures;

import java.util.function.Function;

public class StringCount  {


    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        Integer count = function.apply("Fantastic");
        System.out.println(count);
    }
}



