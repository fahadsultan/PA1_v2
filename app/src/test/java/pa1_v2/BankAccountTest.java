
package pa1_v2;    

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testConstructor() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        assertEquals("John Doe", account.getAccountHolder());
        assertEquals(123456, account.getAccountNumber());
        assertEquals(0, account.getBalance(), 0);
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(100);
        assertEquals(100, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), 0);
    }

    @Test
    public void testAddInterest() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(100);
        account.applyInterest();
        assertEquals(105, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawOverdraft() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(100);
        account.withdraw(200);
        assertEquals(100, account.getBalance(), 0);
    }

    @Test
    public void testDepositNegative() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(-100);
        assertEquals(0, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawNegative() {
        BankAccount account = new BankAccount("John Doe", 123456, 0.05f);
        account.deposit(100);
        account.withdraw(-50);
        assertEquals(100, account.getBalance(), 0);
    }
}
