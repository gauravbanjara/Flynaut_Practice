package Collection.CollectionAssignment;
import java.util.LinkedList;

public class LinkedListAssignment {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();

        // Adding customers in linked list
        customers.add("customer 1");
        customers.add("customer 2");
        customers.add("customer 3");
        customers.add("customer 4");
        customers.add("customer 5");

        // removing first customer
        customers.removeFirst();

        // Adding customer at the end of list
        customers.addLast("new customer 6");

        // Printing the list
        for(String customer : customers){
            System.out.println(customer);
        }
    }
}




