package collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Sammy");
        myMap.put(2, "Lucas");
        myMap.put(3, "Godfrey");
        myMap.put(7, "Lucas");
        myMap.put(4, "Kyle");
        myMap.put(5, "Jude");

        System.out.println(myMap);
    }
}
