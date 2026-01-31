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
       
            
       
        } while (choice != 7);

        input.close();
    }
}