public class LibraryBook {
    private static int count = 0;
    private int bookID;
    private String bookTitle;
    private String author;
    private boolean availabilityStatus;

    public LibraryBook() {
        count++;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public void checkOut() {
        if (availabilityStatus) {
            System.out.println("Book with ID: " + bookID + " has been checked out");
            availabilityStatus = false;
        } else {
            System.out.println("Book is already check out");
        }

    }

    public void returnBook() {
        if (availabilityStatus) {
            System.out.println("Book with ID" + bookID + "has been returned");
            availabilityStatus = true;
        } else {
            System.out.println("Book is already available");
        }

    }

    public static int bookCount() {
        return count;
    }

    public String toString() {
        return "BookID: " + bookID + "\nTitle:" + bookTitle + "\nAuthor: " + author + "\nAvailability: "
                + (availabilityStatus ? "Available" : "Checked Out");

    }
}
