package MyPractice.multi_level_inheritance.BankAccountManagementSystem;

public class Runner {
    public static void main(String[] args) {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("20006",
                500000.000, "70", 5 % 700);
        System.out.println("Account Number:" + fixedDepositAccount.getAccountNumber());
        System.out.println("Balance:" + fixedDepositAccount.getBalance());
        System.out.println("Account Holder:" + fixedDepositAccount.getAccountHolder());
        System.out.println("Interest Rate:" + fixedDepositAccount.getInterestRate());
        System.out.println("Maturity Period:" + fixedDepositAccount.getMaturityPeriod());

    }
}
/*
      Testing:
        In the main method, create a FixedDepositAccount object and display all its details, including those from
        the BankAccount and SavingsAccount classes, and the updated balance details.
 */