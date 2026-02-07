package labs_and_assignments.Lab3;

public abstract class Employee {
 
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
    // TODO 1: Create a constructor
    public Employee(String first, String last, String ssn) {
        //initializing the fields
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
 
    // TODO 2: Create getters
 
    // TODO 3: Declare abstract method earnings()
 
    // TODO 4: Override toString()
}
