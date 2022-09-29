package masterclass.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        LinkedList<String> myLink = new LinkedList<>();

        System.out.println(!checkVowel("qart"));



    }

//    public static long calculateFactorial(long val){
//        if(val > 1){
//            return val * calculateFactorial(val - 1);
//        }
//        else{
//           return 1;
//        }
//    }

    public static boolean checkVowel(String s1){
        return s1.toLowerCase().matches(".*[aeiou].*");
    }
}
