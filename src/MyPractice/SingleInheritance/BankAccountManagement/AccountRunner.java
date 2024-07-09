package MyPractice.SingleInheritance.BankAccountManagement;

public class AccountRunner {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("200019", 50000,0.0 );
        System.out.println("Account Number:" +savingsAccount.getAccountNumber());
        System.out.println("Balance: $ " + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + (savingsAccount.getInterestRate()));

        System.out.println();

    }

}
