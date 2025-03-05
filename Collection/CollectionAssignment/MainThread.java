package Collection.CollectionAssignment;

public class MainThread {
        public static void main(String[] args) {
            Thread thread = new Thread(new ThreadNumberPrinter()); // Creating thread instance
            thread.start(); // Starting the thread
        }
}

