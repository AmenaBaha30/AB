package MyPractice.multi_level_inheritance.LibraryManagementSystem;

public class LibraryBook extends Book{
    private final String libraryId;

    public LibraryBook(String title, String author, String ISBN, String libraryId) {
        super(title, author, ISBN);
        this.libraryId = libraryId;
    }
    public String getLibraryId() {return libraryId;}
}
/*
     First Level of Inheritance:
        Create a derived class called LibraryBook that extends Book.
        Add a private member variable: libraryId (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getLibraryId() to access the library ID.
 */