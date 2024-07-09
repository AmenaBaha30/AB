package MyPractice;

public class Runner {
    // Main Method
    public static void main(String[] args) {
        // Object Student
        var stdObj = new Student();

        // Student Class Properties
        stdObj.studentId = "A101";
        stdObj.graduationDate = "23/06/20224";
        stdObj.subject = "Programming";
        stdObj.grade = 'A';

        // Person Class Properties
        stdObj.setName("Amens");
        stdObj.setAge(35);
        stdObj.setAddress("Virginia");

        System.out.println(stdObj.getName());
        System.out.println(stdObj.getAge());
        System.out.println(stdObj.getAddress());


    }
}
