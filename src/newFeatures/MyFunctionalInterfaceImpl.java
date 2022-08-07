package newFeatures;

public class MyFunctionalInterfaceImpl {

    public static void main(String[] args) {


        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("This method prints");
        myFunctionalInterface.print();
    }
}
