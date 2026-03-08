package labs_and_assignments.Lab4;

import java.util.*;
import java.util.regex.*;
 
 
public class StudentValidatorLab {
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================
 
 
        // STEP 1:
        // Ask user to enter full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
 
 
 
        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()
        if (fullName.matches("[A-Za-z ]+")) {
            System.out.println("Valid name.");
        } 
        else {
            System.out.println("Invalid name. Only letters and spaces allowed.");
        }
 
 
 
 
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================
 
 
        // STEP 3:
        // Ask user to enter student ID
        System.out.print("Enter your Student ID: ");
        String studentID = scanner.nextLine();
 
 
 
        // STEP 4:
        // Validate format using regex
        if (studentID.matches("^[A-Z]-\\d{4}$")){
            System.out.println("Valid ID.");
        }
        else {
            System.out.println("Invalid ID. Must be S-1234 format.");
        }
 
 
 
        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================
 
 
        // STEP 5:
        // Ask user to enter email
        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();
 
 
 
        // STEP 6:
        // Validate email format
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$")){
            System.out.println("Valid Email.");
        }
        else {
            System.out.println("Invalid Email. Must be student@email.com format.");
        }
 
 
 
 
        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================
 
 
        // STEP 7:
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
 
 
 
        // STEP 8:
        // Count vowels using Character class
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
 
 
 
        // STEP 9:
        // Reverse sentence using StringBuilder
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        System.out.println(sb);
 
 
 
        // STEP 10:
        // Replace all digits in sentence with '*'
        String censored = sentence.replaceAll("\\d", "*");

        System.out.println("Sentence with digits replaced: " + censored);
 
 
 
        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================
 
 
        // STEP 11:
        // Create string: "Math,Science,Java,English"
        String classes = "Math,Science,Java,English";
        // Split using comma
        String[] courses = classes.split(","); 
        // Print each course
        for (String course : courses){
            System.out.println("Class: " + course);
        }
 
 
 
        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================
 
 
        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers
 
 
 
 
        scanner.close();
    }
}
 