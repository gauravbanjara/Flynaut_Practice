package Inheritance;

public class BMW extends AbstractExample{
    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    void stop() {
        System.out.println("Car is Stopped");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
    }
}
