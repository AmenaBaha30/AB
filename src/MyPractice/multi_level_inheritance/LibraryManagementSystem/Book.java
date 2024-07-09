package MyPractice.multi_level_inheritance.LibraryManagementSystem;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getISBN() {return ISBN;}
}
/*
     Base Class Creation:
        Create a base class called Book.
        Define private member variables: title (type String), author (type String), and ISBN (type String).
        Provide a constructor to initialize these variables.
        Implement public methods getTitle(), getAuthor(), and getISBN() to access these variables.
 */