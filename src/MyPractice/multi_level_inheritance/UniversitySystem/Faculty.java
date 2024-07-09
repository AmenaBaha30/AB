package MyPractice.multi_level_inheritance.UniversitySystem;

public class Faculty extends UniversityMember {
    private final String department;

    public Faculty(String name, String memberId, String department) {
        super(name, memberId);
        this.department = department;
    }
    public String getDepartment() {return department;}
}
/*
 First Level of Inheritance:
        Create a derived class called Faculty that extends UniversityMember.
        Add a private member variable: department (type String).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getDepartment() to access the department.

 */