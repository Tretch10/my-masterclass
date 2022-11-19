package masterclass.practice;

import java.util.HashSet;
import java.util.Set;

public class NonRepeat {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("aardvark"));

    }

    /*

     */
    public static Set<Character>  firstNonRepeatedCharacter(String input){
        Set<Character> nonRepeatStrings = new HashSet();
        char[] strArray = input.toCharArray();
        for(int i=0; i<input.length();i++){
            nonRepeatStrings.add(strArray[i]);
        }
        return nonRepeatStrings;
    }
}
