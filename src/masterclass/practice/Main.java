package masterclass.practice;

public class Main {

    public static void main(String[] args) {
        int myInt = 121;
        if(myInt == reverse(myInt)){
            System.out.println("Integer palindrome");
        }
        else{
            System.out.println("NOT Integer palindrome");
        }



    }

    public static int reverse(int input){
        String stringConv = Integer.toString(input);
        String rev = "";

        for(int i=stringConv.length()-1; i>=0; i--){
            rev+=stringConv.charAt(i);
        }
        return Integer.parseInt(rev) ;
    }
}
