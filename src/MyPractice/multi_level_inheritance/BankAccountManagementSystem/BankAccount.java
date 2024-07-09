package MyPractice.multi_level_inheritance.BankAccountManagementSystem;

public class BankAccount {
    private final String accountNumber;
    private final double balance;
    private final String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    public String getAccountNumber() {return accountNumber;}
    public double getBalance() {return balance;}
    public String getAccountHolder() {return accountHolder;}
}
/*
      Base Class Creation:
        Create a base class called BankAccount.
        Define private member variables: accountNumber (type String), balance (type double),
        and accountHolder (type String).
        Provide a constructor to initialize these variables.
        Implement public methods getAccountNumber(), getBalance(), and getAccountHolder() to access these variables
 */