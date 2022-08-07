package newFeatures;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable run method...");
    }
}


public class LambdaThread {
    public static void main(String[] args) {
       Thread thread = new Thread(new ThreadDemo());
       thread.start();

       Runnable runnable = () -> System.out.println("Lambda running thread");

       Thread lambdaThread = new Thread(runnable);
       lambdaThread.start();

    }
}
