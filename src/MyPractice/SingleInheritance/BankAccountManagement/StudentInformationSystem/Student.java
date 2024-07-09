package MyPractice.SingleInheritance.BankAccountManagement.StudentInformationSystem;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age) {
        super(name, age);
    }

    // constructor to initialize all variables
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // method
    public String getStudentId(){
        return studentId;
    }
}
