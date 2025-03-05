package Collection.CollectionAssignment;

class ThreadNumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Delay of 500 milliseconds
            } catch (Exception e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}



