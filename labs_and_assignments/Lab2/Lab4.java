package labs_and_assignments.Lab2;

import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            // TODO: Fill in your grocery items
            "Milk", "Eggs", "Bread", "Cereal", "Fish", "Chicken", "Apples"
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        
        System.out.println(groceries.toString());
        
            
            
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList
        for(int i = 0; i < groceries.length; i++){
            groceryList.add(groceries[i]);
        }
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        groceryList.add("Banana");
        groceryList.add("Coffee");
        groceryList.remove("Eggs");
        System.out.println(groceryList.toString());
 
 
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        int count = 0;
        for (String grocery : groceryList) {
            
            grocery = grocery.toLowerCase();
                        
            if (grocery.startsWith("a") ||
                grocery.startsWith("e") ||
                grocery.startsWith("i") ||
                grocery.startsWith("o") ||
                grocery.startsWith("u")) {
                count++;

            }
        }
        
        
 
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        System.out.println("Words stating with Vowels: " + count);
 
    }
}