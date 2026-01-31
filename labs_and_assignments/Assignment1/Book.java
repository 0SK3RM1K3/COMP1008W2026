package labs_and_assignments.Assignment1;

public class Book {
    
    // Private fields
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.available = true;
    }

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        this.available = true;
    }

}
