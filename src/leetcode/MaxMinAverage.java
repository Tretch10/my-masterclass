package leetcode;

import java.util.Arrays;

public class MaxMinAverage {

    public static void main(String[] args) {
        int[] myArr = {5, 80, 15, 7, 6, 8};
        maxMinAverage(myArr);
    }

    public static void maxMinAverage(int[] input){
        Arrays.sort(input);
        int leastNumber = input[0];
        int highestNumber = 0;
        int total = 0;
        int average = 0;

        for(int i=input.length - 1; i>=0; i--){
            highestNumber+=input[i];
            break;
        }
        for(int el: input){
            total+=el;
        }
        average = total/input.length;

        System.out.println("Least value: "+leastNumber+ " ,Highest value: "+highestNumber+", Average value: "+average);


    }
}
