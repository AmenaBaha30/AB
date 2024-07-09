package MyPractice.SingleInheritance.BankAccountManagement.DigitalLibrarySystem;

public class EBook extends Book {
    // final
    private final double fileSize;
    // Constructor
    public EBook(String author,String title, double fileSize) {
        super(title,author);
        this.fileSize = fileSize;
    }
    // Getter
    public double getFileSize() {
        return fileSize;
    }
}
