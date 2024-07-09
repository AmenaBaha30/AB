package MyPractice.multi_level_inheritance.SchoolManagementSystem;

public class Runner {
    public static void main(String[] args) {

        HeadTeacher headTeacher = new HeadTeacher("Ayesha", 23, "English", 5);
        System.out.println("name: " + headTeacher.getName());
        System.out.println("Age:" + headTeacher.getAge());
        System.out.println("Subject:" + headTeacher.getSubject());
    }

}
