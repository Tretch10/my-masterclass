package masterclass.practice;

public class Main {

    public static void main(String[] args) {

        String str2 = "Bob";
        StringBuilder sb = new StringBuilder(str2);
        // System.out.println(reverse("amazon"));
    if(str2.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }

    }

    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()-1) + input.substring(0,input.length()-1);
    }
}
