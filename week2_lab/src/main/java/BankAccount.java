public class BankAccount {
String accountNumber;
String ownerName;
double balance;

void deposit(double amount) {
    balance=balance+amount;
}

void withdraw(double amount) {
    balance=balance-amount;
}

double getBalance() {
    return balance;
}
boolean isOverdrawn(){
    return balance < 0;
}

boolean hasSufficientFunds(double amount) {

        return balance >= amount;
    }

    void ApplyInterest(double rate) {
    double interest = balance * rate;
    balance = balance + interest;
}

    void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance:  K " + balance);
        System.out.println("-------------------------------------------");
    }



}
