package MyPractice.SingleInheritance.BankAccountManagement;

public class SavingsAccount extends Account {

    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance , double interestRate ){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
