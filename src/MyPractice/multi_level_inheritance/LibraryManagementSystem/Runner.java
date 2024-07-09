package MyPractice.multi_level_inheritance.LibraryManagementSystem;

public class Runner {
    public static void main(String[] args) {
        ReferenceBook referenceBook = new ReferenceBook("COP", "Amena", "Add",
                "Aston", "Staffer");
        System.out.println("title: " + referenceBook.getTitle());
        System.out.println("author: " + referenceBook.getAuthor());
        System.out.println("ISBN: " + referenceBook.getISBN());
        System.out.println("Library ID: " + referenceBook.getLibraryId());
        System.out.println("Reference Section: " + referenceBook.getReferenceSection());
    }
}
/*
    Testing:
        In the main method, create a Testing:
        In the main method, create a ReferenceBook object and display all its details,
         including those from the Book and LibraryBook classes, and the updated author details. object and display all its details,
         including those from the Book and LibraryBook classes, and the updated author details.
 */