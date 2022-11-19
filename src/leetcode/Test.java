package leetcode;

public class Test {

    public static void main(String[] args) {
        String s1 = "abcabc";
        StringBuilder s2 = new StringBuilder("a");

        System.out.println(s2.indexOf(String.valueOf(s1.charAt(3))));
    }
}
