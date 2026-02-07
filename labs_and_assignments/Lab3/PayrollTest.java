package labs_and_assignments.Lab3;

public class PayrollTest {
 
    public static void main(String[] args) {
 
        // TODO 9: Create a CommissionEmployee object
        CommissionEmployee ce1 = new CommissionEmployee("Mike", "Raferty", "555-21-962", 21750, .04);
 
        // TODO 10: Display employee details
        System.out.printf(ce1.toString());
 
        // TODO 11: Display earnings
        System.out.printf("%S earned: $%s",ce1.getFirstName(), ce1.earnings());
    }
}
