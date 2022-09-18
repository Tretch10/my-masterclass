package masterclass.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {


    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add("Sam");
        myList.add(45.0);
        myList.add(false);

        System.out.println(myList);
    }
}
