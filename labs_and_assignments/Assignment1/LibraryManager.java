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
            
                default:
                    
                    System.out.println("Invalid choice. Try again.");
            }
       
        } while (choice != 7);

        input.close();
    }
}