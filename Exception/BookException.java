package Exception;

public class BookException {
        private int bookId;
        private String title;
        private boolean isAvailable;
        public BookException(int bookId, String title) {
            this.bookId = bookId;
            this.title = title;
            this.isAvailable = true;
        }
        public void rentBook() {
            try {
                if (!isAvailable) {
                    throw new Exception("Book is currently unavailable.");
                }
                isAvailable = false;
                System.out.println("Book rented successfully.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        public void returnBook() {
            isAvailable = true;
            System.out.println("Book is returned! Book is now available.");
        }

        public static void main(String[] args) {
            BookException book1 = new BookException(1, "The Lord of the Rings");
            BookException book2 = new BookException(2, "To Kill a Mockingbird");
            BookException book3 = new BookException(3, "1984");

            book1.rentBook(); // Here Book1 is rented.
            book2.rentBook(); // Here Book2 is rented.
            book1.rentBook(); // This will Print Book is currently unavailable.
            book1.returnBook(); // Book1 is return and now it's available.

            book1.rentBook(); // here Book1 is rented again successfully
        }
}


