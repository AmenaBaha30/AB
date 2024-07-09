package MyPractice.SingleInheritance.BankAccountManagement.LibraryInventorySystem;

public class Magazine extends LibraryItem{

    private final int issueNumber;

    public Magazine(String title, int yearPublished, int issueNumber) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
