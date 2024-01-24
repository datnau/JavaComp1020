public class LibraryTest {
    public static void main(String[] args) {
        // Create object for LibraryBook using default constructor
        LibraryBook book = new LibraryBook();

        // Set values using setters
        book.setBookID(1);
        book.setBookTitle("Sample Book");
        book.setAuthor("Author Name");
        book.setAvailabilityStatus(true);

        // Call methods
        book.checkOut();
        book.returnBook();

        // Display book details using toString()
        System.out.println(book.toString());
        // Original book object
        LibraryBook book1 = new LibraryBook();
        book1.setBookID(1);
        book1.setBookTitle("Introduction to Java");
        book1.setAuthor("John Doe");
        book1.setAvailabilityStatus(true);

        // Additional book objects
        LibraryBook book2 = new LibraryBook();
        LibraryBook book3 = new LibraryBook();
        LibraryBook book4 = new LibraryBook();
        System.out.println("Total number of books created: " + LibraryBook.bookCount());
    }
}
