package leetcode;

public class InverseInteger {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     */

    public static void main(String[] args) {
      //  System.out.println(reverseInt(123456));
        System.out.println(reverseString("hello"));

    }

    public static int reverseInt(int input){
        int remainder = 0;
        int reverse = 0;
        while (input !=0){
           remainder = input % 10;
           reverse = (reverse*10) + remainder;
            input = input / 10;
        }
        return reverse;
    }

    public static String reverseString(String str){
        char ch;
        String reverseString = "";
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            reverseString = ch+reverseString;

        }
        return reverseString.toString();
    }
}
