package masterclass.practice;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(areAnagrams("stop", "poti"));

    }

    static boolean areAnagrams(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        //sort array of characters
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("String pairs are not of equal length");

        }


       return Arrays.equals(arr1, arr2);
    }
}
