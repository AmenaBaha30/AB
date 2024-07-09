package MyPractice.multi_level_inheritance.BankAccountManagementSystem;

public class FixedDepositAccount extends SavingsAccount {

    public FixedDepositAccount(String accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder, interestRate);
    }
    public int getMaturityPeriod(){
        return 0;}
    @Override
    public double getBalance(){ return super.getBalance();}
}

/*
     Second Level of Inheritance:
        Create a derived class called FixedDepositAccount that extends SavingsAccount.
        Add a private member variable: maturityPeriod (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getMaturityPeriod() to access the maturity period.

        Method Implementation:
        In the FixedDepositAccount class, override the getBalance() method to include
        interest based on the maturity period.
 */