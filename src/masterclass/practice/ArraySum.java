package masterclass.practice;

public class ArraySum {

    public static void main(String[] args) {
//        int[] myArr = {1,2,8,9,10,5};
//        System.out.println(sumArray(myArr));

        float myFloat;

    }

    public static int sumArray(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
