package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
    public static void main(String[] args) {
        List<Book> book = new ArrayList<>();
        book.add(new Book("Mahabharat","Ved Vyasa",500));
        book.add(new Book("Bhagavad Gita","Ved Vyasa",980));
        book.add(new Book("Hanuman Chalisa","Tulsidas",450));

//        Collections.sort(book); // using comparable
        Collections.sort(book, new PriceComparator()); // using Comparator
        System.out.println(book);
    }
}
