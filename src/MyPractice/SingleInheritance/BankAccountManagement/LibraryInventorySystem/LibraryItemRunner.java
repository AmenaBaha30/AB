package MyPractice.SingleInheritance.BankAccountManagement.LibraryInventorySystem;

public class LibraryItemRunner {
    public static void main(String[] args) {

        Magazine magazineObj = new Magazine("English", 2024, 300);
        System.out.println("Title: " + magazineObj.getTitle());
        System.out.println("Year publish: " + magazineObj.getYearPublished());
        System.out.println("Issue number: " + magazineObj.getIssueNumber());

    }
}



