package masterclass.datastructure;

public class LinearSearchAlgo {

    public static void main(String[] args) throws Exception {
        int[] myNumbers = {1,2,3,4,5,6,7,8,9,10};
        int targetNumber = 6;
        System.out.println(linearSearch(myNumbers, targetNumber));

    }

    public static int linearSearch(int[] myArr, int target) throws Exception {
        int index = 0;
        // loop through array, check if value is equal to target
        //if no, return throw exception, if yes return index
        for(int i=0; i<myArr.length;i++){
            if(myArr[i] == target){
               return index += i;
            }

        }
        return -1;
    }
}
