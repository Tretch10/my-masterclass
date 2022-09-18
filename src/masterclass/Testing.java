package masterclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Testing {


    public static void main(String[] args) {
        String s1 = "dad";
        if(s1.equals(reverse(s1))){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }



    }
    public static String reverse(String s1) {
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev+= s1.charAt(i);
        }
        return rev;
    }
}
