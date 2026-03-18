import static org.junit.Assert.*;
import org.junit.Test;
 
 
// Test suite for all classes
public class BigTestSuite {
 
 
    // Calculator tests
    Calculator calc = new Calculator();
 
 
    @Test
    public void testAdd() {
        assertEquals(10,calc.add(5, 5));
    }
 
 
    @Test
    public void testSubtract() {
        assertEquals(6,calc.subtract(10, 4));
    }
 
 
    @Test
    public void testMultiply() {
        assertEquals(40,calc.multiply(10, 4));
    }
 
 
    @Test
    public void testDivide() {
        assertEquals(2,calc.divide(8, 4));
    }
 
 
    // Exception test (division by zero)
   
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){

        calc.divide(10,0);

    }
 
 
    // StringUtility tests
    StringUtility strUtil = new StringUtility();
 
 
    @Test
    public void testReverse() {
        assertEquals("OLLEH",strUtil.reverse("HELLO"));
    }
 
 
    @Test
    public void testPalindromeTrue() {
        assertTrue(strUtil.isPalindrome("madam"));
    }
 
 
    @Test
    public void testPalindromeFalse() {
        assertFalse(strUtil.isPalindrome("hello"));
    }
 
 
 
 
    // BankAccount tests
    @Test
    public void testDeposit() {
 
 
        BankAccount acc = new BankAccount("John",500);
        acc.deposit(200);
 
        assertEquals(700, acc.getBalance(),0.001);
       
    }
 
 
    @Test
    public void testWithdraw() {
 
 
        BankAccount acc = new BankAccount("John",500);
        acc.withdraw(200);
 
        assertEquals(300, acc.getBalance(),0.001);
       
    }
 
 
 
 
    // Exception test: withdraw more than balance
    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawlToomuch(){

        BankAccount acc = new BankAccount("John",500);
        acc.withdraw(600);

    }
    
 
    
 
 
 
 
    // Exception test: negative deposit
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit(){

        BankAccount acc = new BankAccount("John",500);
        acc.withdraw(-200);

    }
 
}