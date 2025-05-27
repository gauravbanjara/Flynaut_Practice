package IJP;

public class DeadlockExample {
    public static Object object1 = new Object();
    public static Object object2 = new Object();

    private static class Mythread1 extends Thread {
        @Override
        public void run() {
            synchronized (object1){
                System.out.println("thread 1 : holding object 1");
                try {
                    Mythread1.sleep(500);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Thread 1 waiting for object 2");
                synchronized (object2){
                    System.out.println("Thread 1 holding object 1 & 2");
                }
            }
        }
    }

    private static class Mythread2 extends  Thread{
        @Override
        public void run() {
            synchronized (object2){
                System.out.println("thread 2 : holding object 2");
                System.out.println("Thread 2 waiting for object 1");
                synchronized (object1){
                    System.out.println("Thread 2 holding object 1 & 2");
                }
            }
        }
    }

    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();
        mythread1.start();
        mythread2.start();
    }
}
