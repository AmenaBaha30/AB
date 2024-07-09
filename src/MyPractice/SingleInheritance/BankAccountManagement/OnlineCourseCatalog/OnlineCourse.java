package MyPractice.SingleInheritance.BankAccountManagement.OnlineCourseCatalog;

public class OnlineCourse extends Course {

    private final String platform;

    // Constructor
    public OnlineCourse(String courseName, String courseCode, String platform) {
        super(courseName, courseCode);
        this.platform = platform;
    }
    // Getter
    public String getPlatform() {
        return platform;
    }

}
