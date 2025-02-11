package ComparableAndComparator.Assignment;
import java.util.*;
class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    public Book(int bookId, String title, double price) {this.bookId = bookId; this.title = title; this.price = price;}

    @Override
    public int compareTo(Book bk) {
        if (Double.compare(this.price, bk.price) == 0) { // First, compare by price in ascending order
            return this.title.compareTo(bk.title); // If prices are the same, compare by title in alphabetical order
        }
        return Double.compare(this.price, bk.price);
    }
    @Override
    public String toString() { return "Book{bookId=" + bookId + ", title='" + title + "', price=" + price + "}";}
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", 550.56));
        books.add(new Book(102, "Python Basics", 399.99));
        books.add(new Book(103, "Data Structures", 425.99));
        books.add(new Book(104, "Frontend Basics", 350.00));
        books.add(new Book(105, "Operating Systems", 399.99));

        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

