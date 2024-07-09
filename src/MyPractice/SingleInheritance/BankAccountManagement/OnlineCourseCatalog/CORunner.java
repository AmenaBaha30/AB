package MyPractice.SingleInheritance.BankAccountManagement.OnlineCourseCatalog;

public class CORunner {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("Tek", "210", "SDLC");
        System.out.println("Course name: " + onlineCourse.getCourseName());
        System.out.println("Course code: " + onlineCourse.getCourseCode());
        System.out.println("Course platform: " +  onlineCourse.getPlatform());

    }
}
