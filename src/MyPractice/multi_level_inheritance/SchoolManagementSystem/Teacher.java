package MyPractice.multi_level_inheritance.SchoolManagementSystem;

public class Teacher extends Person {
    private final String subject;

    // constructor to initialize all variables, including those in the base class.

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    // Method Getter
    public String getSubject(){
        return subject;
    }

}
/*
    First Level of Inheritance:
        Create a derived class called Teacher that extends Person.
        Add a private member variable: subject (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getSubject() to access the subject.
 */