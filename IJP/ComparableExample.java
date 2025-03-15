package IJP;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample>{
    private int id;
    private String name;
    private String city;

    public ComparableExample(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Comparable Example{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(ComparableExample e) {
//        return this.id - e.id; // Ascending order
//        return Integer.compare(this.id,e.id); // Ascending order
        return Integer.compare(e.id,this.id); // Descending order
    }

    public static void main(String[] args) {
        ArrayList<ComparableExample> std = new ArrayList<>();
        std.add(new ComparableExample(1,"GAurav", "Shirpur"));
        std.add(new ComparableExample(5,"Mahi", "Pune"));
        std.add(new ComparableExample(9,"Mukesh", "Mohide"));
        std.add(new ComparableExample(4,"Akash", "Nashik"));

        System.out.println(std);

        System.out.println("_______________________________________________________________________________________________________________");
        Collections.sort(std);

        System.out.println(std);

    }
}
