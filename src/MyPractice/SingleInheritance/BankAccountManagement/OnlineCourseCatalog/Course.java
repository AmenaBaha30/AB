package MyPractice.SingleInheritance.BankAccountManagement.OnlineCourseCatalog;

public class Course {
        private final String courseName;
        private final String courseCode;

        // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
   public String getCourseCode(){
        return courseCode;
    }


}
    /*
    Project: Online Course Catalog

Objective: Use single inheritance to extend a class with educational context.

Steps:

    1. Create a base class called Course.
    2. Define private member variables: courseName (type String) and courseCode (type String).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getCourseName() and getCourseCode() to access these variables.
    5. Create a derived class called OnlineCourse that extends Course.
    6. Add a private member variable: platform (type String).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getPlatform() to access the platform.
    9. In a main method, create an OnlineCourse object and display all the details.
     */