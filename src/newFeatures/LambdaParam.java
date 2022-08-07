package newFeatures;

interface Addable{
    int addition(int a, int b);

}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}






public class LambdaParam {

    public static void main(String[] args) {
        Addable addable = (a, b) -> (a + b);

        int result = addable.addition(6,7);
        System.out.println(result);
    }
}
