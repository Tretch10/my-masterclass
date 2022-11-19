package masterclass.datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapper {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new LinkedHashMap<>();
        myMap.put("John", 500);
        myMap.put("Andrew", 470);
        myMap.put("Jude", 300);
        myMap.put("Larry", 600);
        myMap.put("Kingsley", 300);

        System.out.println(myMap);
    }
}
