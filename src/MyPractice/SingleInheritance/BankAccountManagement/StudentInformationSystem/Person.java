package MyPractice.SingleInheritance.BankAccountManagement.StudentInformationSystem;

public class Person {
    private final String name;
    private final int age;

    // constructor to initialize these variables

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


}
/*
    Project: Student Information System

Objective: Practice creating a derived class with additional functionality.

Steps:

    1. Create a base class called Person.
    2. Define private member variables: name (type String) and age (type int).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getName() and getAge() to access these variables.
    5. Create a derived class called Student that extends Person.
    6. Add a private member variable: studentId (type String).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getStudentId() to access the student ID.
    9. In a main method, create a Student object and display all the details.
 */