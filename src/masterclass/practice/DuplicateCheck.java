package masterclass.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheck {

    public static void main(String[] args) {
        int myVals[] = {2,4,4,8,7,10,3,11,8};
        System.out.println(removeDup(myVals));

    }

    public static Set<Integer> removeDup(int myArr[]){
        Set<Integer> nonDup = new HashSet<>();
        for(int i=0; i<myArr.length; i++){
            nonDup.add(myArr[i]);
        }
        return nonDup;
    }
}
