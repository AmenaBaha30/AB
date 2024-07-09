package MyPractice.multi_level_inheritance.BankAccountManagementSystem;

public class SavingsAccount extends BankAccount{
    private final double  interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){return interestRate;}
}
/*
     First Level of Inheritance:
        Create a derived class called SavingsAccount that extends BankAccount.
        Add a private member variable: interestRate (type double).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getInterestRate() to access the interest rate.
 */