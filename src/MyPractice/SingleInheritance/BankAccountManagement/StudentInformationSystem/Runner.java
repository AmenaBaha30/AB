package MyPractice.SingleInheritance.BankAccountManagement.StudentInformationSystem;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student("Amena",24, "B780" );
        System.out.println("Name:" + student.getName());
        System.out.println("age:"+ student.getAge());
        System.out.println("Student ID: "+ student.getStudentId());
    }
}
