import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit_shouldIncreaseBalance() {
        BankAccount account = new BankAccount();
        account.balance = 1000.00;
        account.deposit(500.00);
        assertEquals(1500.00, account.getBalance());
    }

    @Test
    void withdraw_shouldDecreaseBalance() {
        BankAccount account = new BankAccount();
        account.balance = 2000.00;
        account.withdraw(800.00);
        assertEquals(1200.00, account.getBalance());
    }

    @Test
    void hasSufficientFunds_returnsTrueWhenBalanceIsEnough() {
        BankAccount account = new BankAccount();
        account.balance = 3000.00;
        boolean result = account.hasSufficientFunds(1000.00);
        assertTrue(result);
    }

    @Test
    void hasSufficientFunds_returnsFalseWhenBalanceIsNotEnough() {
        BankAccount account = new BankAccount();
        account.balance = 200.00;
        boolean result = account.hasSufficientFunds(500.00);
        assertFalse(result);
    }

    @Test
    void isOverdrawn_returnsTrueWhenBalanceIsNegative() {
        // ARRANGE — This creates an account with negative balance
        BankAccount account = new BankAccount();
        account.balance = -100.00;
        
        // ACT — This  checks if account is overdrawn
        boolean result = account.isOverdrawn();
        
        // ASSERT — This should returns true when balance is negative
        assertTrue(result);
    }

    @Test
    void isOverdrawn_returnsFalseWhenBalanceIsPositive() {
        // ARRANGE — This creates an account with positive balance
        BankAccount account = new BankAccount();
        account.balance = 500.00;
        
        // ACT — This checks if account is overdrawn
        boolean result = account.isOverdrawn();
        
        // ASSERT — This  returns false when balance is positive
        assertFalse(result);
    }
}

