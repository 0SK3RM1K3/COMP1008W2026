package labs_and_assignments.Lab5;

//STARTER CODE
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class CalculatorApp extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Step 1: Create TextFields for input
        TextField inputField1 = new TextField();
        TextField inputField2 = new TextField();
 
        // Step 2: Create Buttons for operations
        Button plusBtn = new Button("+");
        Button minusBtn = new Button("-");
        Button multiplyBtn = new Button("*");
        Button devisionBtn = new Button("/");
 
        // Step 3: Create Label for result
        Label resultsLabel = new Label("Results: ");

        // Step 4: HBox for buttons
        HBox buttonBox = new HBox(10, plusBtn, minusBtn, multiplyBtn, devisionBtn);

        // Step 5: VBox main layout
       
        // Step 6: Event handling for buttons
       
        // Step 7: Create scene and show stage
       
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
 
//TASKS TO COMPLETE(SUBMIT SCREENSHOTS FOR ALL TASKS)
 
//TODO:Enter numbers in the two TextFields.
 
//TODO:Click any operation button to see the result in the Label.
 
//TODO:Test for division by zero. 
 
//TODO:Try entering invalid input (letters) and observe program behavior (optional: you can handle exceptions for invalid input).
 
// EXPECTED OUTPUT:
// Example 1:
 
// Input1: 10
// Input2: 5
// Click '+'
// Result: 15.0
 
 
// Example 2:
 
// Input1: 8
// Input2: 0
// Click '/'
// Result: Error: Division by zero
 
 
// Example 3:
 
// Input1: 7
// Input2: 3
// Click '*'
// Result: 21.0
