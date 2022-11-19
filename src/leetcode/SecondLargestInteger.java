package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInteger {

     

    public static void main(String[] args) {
        int[] myNums = {2,4,0,6,15,10};
        System.out.println(secondLargestInt(myNums));

    }

    public static int secondLargestInt(int[] input){
        List<Integer> wrapperInput = new ArrayList<>();
        for(int value: input){
            wrapperInput.add(value);
        }
        Collections.sort(wrapperInput, Collections.reverseOrder());
        return wrapperInput.get(1);
    }
}
