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

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters with validation
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    public void setIsbn(String isbn) {
        if (isbn != null && (isbn.length() == 10 || isbn.length() == 13)) {
            this.isbn = isbn;
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}
