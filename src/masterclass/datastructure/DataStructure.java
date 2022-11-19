package masterclass.datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructure {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(5);
        myQueue.add(2);
        myQueue.add(6);
        myQueue.add(3);
        myQueue.add(9);

        System.out.println(myQueue.poll());
        System.out.println(myQueue);


    }
}
