package IJP;


// Creating Thread by extending Thread class
public class ChildThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

