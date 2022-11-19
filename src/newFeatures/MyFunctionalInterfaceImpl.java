package newFeatures;

import java.util.function.Consumer;

public class MyFunctionalInterfaceImpl {

    public static void main(String[] args) {


        Consumer<Integer> consumer = (val) -> System.out.println("This is your value: "+val);
        consumer.accept(10);
    }
}
