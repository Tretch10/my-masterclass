package leetcode;

public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    static boolean isPalindrome(int input){
        String stringInput = String.valueOf(input);
        StringBuilder revString = new StringBuilder(stringInput);
        if(stringInput.equals(revString.reverse().toString())){
            return true;
        }
        return false;
    }
}
