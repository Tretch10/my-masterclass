package collections;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("John");
        mySet.add("Paul");
        mySet.add("John");
        mySet.add(null);
        mySet.add("Landry");



        System.out.println(mySet);
    }
}
