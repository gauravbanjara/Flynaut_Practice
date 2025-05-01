package IJP;

public class MainThread {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
