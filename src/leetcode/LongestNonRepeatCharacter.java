package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNonRepeatCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatingLength("abcabc"));

    }

    public static int nonRepeatingLength(String input){
        int maxLength = 0;

        for(int i=0; i<input.length(); i++){
            StringBuilder currentString = new StringBuilder();
            for(int j=i; j<input.length(); j++){
                if(currentString.indexOf(String.valueOf(input.charAt(j))) != -1){
                   break;
                }
                currentString.append(input.charAt(j));
            }
            maxLength = Math.max(maxLength, currentString.length());
        }
        return maxLength;
    }
}
