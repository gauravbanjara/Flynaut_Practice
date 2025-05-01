package IJP;

public class MainThreadUsingRunnable {
    public static void main(String[] args) {
        ChildThreadUsingRunnable childThreadUsingRunnable = new ChildThreadUsingRunnable();
        Thread thread = new Thread(childThreadUsingRunnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
