package Collections.Assignment;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> meetings = new LinkedList<>();
        meetings.add("Hiring new employees");
        meetings.add("Bonus");
        meetings.add("Projects");
        meetings.add("Salary increment");

        // adding new topic at the end
        meetings.addLast("Client Feedback");

        // removing topic from second position
        meetings.remove(1);

        // Display the current agenda topics
        System.out.println("Current Agenda Topics:");
        for (String topic : meetings) {
            System.out.println("- " + topic);
        }
    }
}


