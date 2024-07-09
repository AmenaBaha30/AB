package MyPractice.SingleInheritance.BankAccountManagement.DigitalLibrarySystem;

public class BookRunner {
    public static void main(String[] args) {
        // Obj anc call
        EBook eBook = new EBook("A_Z" , "Amena" , 2.4);
        System.out.println(eBook.getAuthor());
        System.out.println(eBook.getTitle());
        System.out.println(eBook.getFileSize());
    }
}
