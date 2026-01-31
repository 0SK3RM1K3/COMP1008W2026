package labs_and_assignments.Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            // Menu
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer
       
            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = input.nextLine();

                    System.out.print("Enter author: ");
                    String author = input.nextLine();

                    System.out.print("Enter ISBN (10 or 13 chars): ");
                    String isbn = input.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    library.add(newBook);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    int availableCount = 0;
                    int checkedOutCount = 0;

                    for (Book book : library) {
                        book.displayInfo();
                        if (book.isAvailable()) {
                            availableCount++;
                        } else {
                            checkedOutCount++;
                        }
                    }

                    System.out.println("Available books: " + availableCount);
                    System.out.println("Checked out books: " + checkedOutCount);
                    break;
                
                case 3:
                    for (Book book : library) {
                        if (book.isAvailable()) {
                            book.displayInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter author name to search: ");
                    String searchAuthor = input.nextLine();

                    for (Book book : library) {
                        if (book.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            book.displayInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter ISBN to check out: ");
                    String checkoutIsbn = input.nextLine();

                    for (Book book : library) {
                        if (book.getIsbn().equals(checkoutIsbn) && book.isAvailable()) {
                            book.setAvailable(false);
                            System.out.println("Book checked out.");
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = input.nextLine();

                    for (Book book : library) {
                        if (book.getIsbn().equals(returnIsbn) && !book.isAvailable()) {
                            book.setAvailable(true);
                            System.out.println("Book returned.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;
                
                default:
                    
                    System.out.println("Invalid choice. Try again.");
            }
       
        } while (choice != 7);

        input.close();
    }
}