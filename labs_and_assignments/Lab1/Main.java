//Anthony Sotera

package labs_and_assignments.Lab1;
import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String todaysWeather;
        String possibilityOfPrecipitation;
        String windSpeed;
        double dailyHigh;
        double dailyLow;
        int uvIndex;
 
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index
        
        System.out.print("Enter today's weather (sunny, cloudy, rainy, etc.): ");
        todaysWeather = input.nextLine();

        System.out.print("Enter possibility of precipitation (low, medium, high): ");
        possibilityOfPrecipitation = input.nextLine();

        System.out.print("Enter wind speed description (calm, breezy, windy): ");
        windSpeed = input.nextLine();


        // Validate low temperature
        while (true) {
            System.out.print("Enter today's low temperature: ");
            if (input.hasNextDouble()) {
                dailyLow = input.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid number.");
                input.next();
            }
        }

        // Validate high temperature (must be >= low)
        while (true) {
            System.out.print("Enter today's high temperature: ");
            if (input.hasNextDouble()) {
                dailyHigh = input.nextDouble();
                if (dailyHigh >= dailyLow) {
                    break;
                } else {
                    System.out.println("High temperature must be greater than or equal to the low temperature.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                input.next();
            }
        }

        // Validate UV index
        while (true) {
            System.out.print("Enter UV index (0–11): ");
            if (input.hasNextInt()) {
                uvIndex = input.nextInt();
                if (uvIndex >= 0 && uvIndex <= 11) {
                    break;
                } else {
                    System.out.println("UV index must be between 0 and 11.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                input.next();
            }
        }

 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
        
 
        // TODO: Apply typecasting where necessary
        int highTempInt = (int) dailyHigh;
        int lowTempInt = (int) dailyLow;

        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
        String tips = "";

        if (uvIndex >= 6) {
            tips += "Use sunscreen. ";
        }

        if (possibilityOfPrecipitation.equalsIgnoreCase("high")) {
            tips += "Carry an umbrella. ";
        }

        if (windSpeed.equalsIgnoreCase("windy")) {
            tips += "Expect windy conditions. ";
        }
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
        String fullReport =
                "Today's weather is " + todaysWeather + ". \n" +
                "The low is " + lowTempInt + "° and the high is " + highTempInt + "°. \n" +
                "Precipitation chance is " + possibilityOfPrecipitation + ". \n" +
                "Wind conditions are " + windSpeed + ". \n" +
                "UV index is " + uvIndex + ". \n" +
                tips;
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
        System.out.println("\n--- Weather Report ---");
        System.out.println(fullReport);
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 