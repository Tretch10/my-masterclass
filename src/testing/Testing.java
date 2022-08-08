package testing;


public class Testing {



    public static void main(String[] args) {
//        StringBuilder s2 = new StringBuilder(s1);
//
//        System.out.println(s2.reverse());

        String s1 = "hello";
        char[] input = s1.toCharArray();
        for (int i = input.length-1; i >= 0; i--){
            System.out.println(input[i]);
        }

        String s2 = "tulum";
        for(char i: s2.toCharArray()){
            if(s2.indexOf(i) == s2.lastIndexOf(i)){
                System.out.println(i);
            }
        }

        String s4 = "hello";
        if (s4.toLowerCase().matches(".*[aeiou]*.")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
