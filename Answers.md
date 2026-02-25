# **PART 1:BUILD THE BANK ACCOUNT CLASS**
# QUESTION 1
1. String accountNumber

2. String ownerName

2. double balance

# QUESTION 2

double getBalance() 
- This returns a double interger value.

boolean hasSufficientFunds(double amount)
- this returns a boolean value.

# QUESTION 3

void deposit(double amount)

- This function does not return anything however it just modifies  the account by adding money to the balance.

double getBalance()

- Returns a value (the current balance) and it does not change anything in the account.


# **PART 2:CREATE OBJECTS AND USE THEM**

# QUESTION 4
- acc2 balance will not change, it will remain K1500.0 and the reason is that acc2 and acc1 are  two seperate objects.

# QUESTION 5
- new is a keyword in java and (new) can be used to create a new object in memory.

# QUESTION 6
- The dot operator (.) is also called the member access operator, because it is used to access variables inside an object and Call methods that belong to an object.

# **PART 3 :Extend the ClassYourself**

# Methods
- # (Main.java)
- acc1.ApplyInterest(0.05);
- acc1.printStatement();

- # (BankAccount.java)
- void ApplyInterest(double rate) {
    double interest = balance * rate;
    balance = balance + interest;
}


# **PART 4 :WRITE YOUR FIRST UNIT TESTS (jUNIT)M**

# QUESTION 7
- @Test is a JUnit annotation that marks a method as a test case that should be executed by the test framework.

# Why JUnit needs it:

- Identifies test methods: Without @Test, JUnit wouldn't know which methods to run as tests.
- Distinguishes from regular code: Separates test methods from utility methods in the class.
- Enables execution: JUnit scans for @Test annotations and automatically runs those methods during mvn test.
- Provides metadata: It tells Maven/IDE which methods to execute and in what order.

# QUESTION 8
- assertEquals(expected, actual) is a JUnit assertion method that checks if the expected value is equal to the actual value. If they are not equal, the test will fail and report an error. 

# QUESTION  9
- The deposit() method is either:

- Missing the code to add the amount to balance.
- Has a logic error that prevents updating the balance.
- Returns early without making the deposit

