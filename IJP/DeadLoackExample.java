package IJP;

public class DeadLoackExample {
    public static void main(String[] args) {
        myThread1 myThread1 = new myThread1();
        myThread2 myThread2 = new myThread2();
        myThread1.start();
        myThread2.start();
    }
     public static Object lock1 = new Object();
     public static Object lock2 = new Object();

     private static class myThread1 extends Thread{
         @Override
         public void run() {
             synchronized (lock1){
                 System.out.println("Thread 1 : Holds lock 1");
                 try {
                     myThread1.sleep(500);
                 } catch (InterruptedException e) {
                 }
                 System.out.println("Thread 1 : waiting for lock 2");
                 synchronized (lock2){
                     System.out.println("Thread 1 : Holds lock 1 and lock 2");
                 }
             }
         }
     }
    private static class myThread2 extends Thread{
         @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread 2 : Holds lock 2");
                System.out.println("Thread 2 : waiting for lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2 : Holds lock 1 and lock 2");
                }
            }
        }
    }
}
