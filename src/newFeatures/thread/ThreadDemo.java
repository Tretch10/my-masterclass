package newFeatures.thread;

public class ThreadDemo {

    public static void main(String[] args) {

        new Thread(new ChelseaThread()).start();
        new Thread(new ManUnitedThread()).start();
        new Thread(new LiverpoolThread()).start();

    }
}
