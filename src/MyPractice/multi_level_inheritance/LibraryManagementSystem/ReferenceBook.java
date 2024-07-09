package MyPractice.multi_level_inheritance.LibraryManagementSystem;

public class ReferenceBook extends LibraryBook {

    private final String referenceSection;

    public ReferenceBook(String title, String author, String ISBN, String libraryId, String referenceSection) {
        super(title, author, ISBN, libraryId);
        this.referenceSection = referenceSection;
    }
    public String getReferenceSection() {return referenceSection;}

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }
}
/*
    Second Level of Inheritance:
        Create a derived class called ReferenceBook that extends LibraryBook.
        Add a private member variable: referenceSection (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getReferenceSection() to access the reference section.

        Method Implementation:
        In the ReferenceBook class, override the getAuthor() method to include the reference
        section in the author description.
 */