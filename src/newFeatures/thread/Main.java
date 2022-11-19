package newFeatures.thread;

public class Main extends Thread{
    public static int amount = 0;

    public void run(){
        amount++;
    }

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
