package IJP;

public class ThreadExample {
    public static void main(String[] args) {
        Mythread t = new Mythread();  // create new thread
        t.start(); // starting the thread by calling start()

        t.setName("panther thread");
        System.out.println("Name of thread is: "+t.getName());
        System.out.println("current thread has priority of: "+t.getPriority());
    }
}

// Creating thread by extending Thread class
class Mythread extends Thread{
    @Override
    public void run() {  // Override run method
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Delay of 500 milliseconds inside the loop
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
