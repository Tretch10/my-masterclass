package masterclass.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddChecker {

    public static void main(String[] args) {
        int myArr[] = {};
        getOdd(myArr);
    }

    public static void getOdd(int vals[]){
        if(vals.length == 0){
            throw new IllegalArgumentException("Error! Integer Array is empty");
        }
        for(int i=0; i<vals.length; i++){
            if(vals[i]%2 != 0){
                System.out.println(vals[i]);
            }


        }

    }
}
