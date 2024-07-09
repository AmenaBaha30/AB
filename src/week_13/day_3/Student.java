package week_13.day_3;

public class Student {
    // Fields to store the information
   private String FirstName;
   private final String LastName;
   private final String DateOfBirth;

    // One Fields which is shared among all objects and the value is the same and final
    static final String className = "Spartans";

    // Constructor
    public Student(String firstName, String lastName, String dateOfBirth, String className) {
       setFirstName(firstName);
       this.LastName = lastName;
        this.DateOfBirth = dateOfBirth;
    }

    // Getter
    public String getFirstName() {
        return FirstName;}
    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }

    // Method to print the information of the Student
    public void printInfo(){
        System.out.println("First Name:" + FirstName);
        System.out.println("LastName:" + LastName);
        System.out.println("DateOfBirth:" + DateOfBirth);
    }


}
