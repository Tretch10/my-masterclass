package masterclass;


import java.util.*;

public class Main {








    public static void main(String[] args) {
        int[] myArr = {23, 12, 18, 7, 19, 78, 45, 76};

        System.out.println("Array length: "+ myArr.length);

        System.out.println("First 5 elements in myArr: ");
        for(int i = 0; i < 5; i++){
            System.out.println(myArr[i]);
        }
        System.out.println("Printing all elements except 3rd: ");
        for(int i = 0; i < myArr.length; i++){
            if(i != 2){
                System.out.println(myArr[i]);
            }
        }







    }
}
