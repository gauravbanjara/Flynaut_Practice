package Collections.Assignment;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        // Add 5 product names
        products.add("laptop");
        products.add("Cricket bat");
        products.add("Football");
        products.add("Mobile phone");
        products.add("Charger");

        // Insert a new product at the beginning.
        products.addFirst("Headphones");

        // Remove the product at the last position.
        products.removeLast();

        // Count and display the number of items in the shopping cart
        int count = 0;
        for(String product : products){
            count++;
            System.out.println(product);
        }
        System.out.println("Total number of product in cart is: " +count );
    }
}


