package week_13.day_2.interfacetopic;

public class Student implements Spartans, TekSchool{

    // Fields
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    // constructor
    public Student(String firstName, String lastName, String dateOfBirth){
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }
    // Getters
    private String getFirstName(){return firstName;}
    private String getLastName(){return lastName;}
    private String getDateOfBirth(){return dateOfBirth;}

    // Setters
    private void setDateOfBirth(String dateOfBirth) {}
    private void setLastName(String lastName) {}
    private void setFirstName(String firstName) {}

    @Override
    public void printStudentInfo(){
        System.out.println("First Name:" + getFirstName());
        System.out.println("last Name:" + getLastName());
        System.out.println("Date Of Birth:" + getDateOfBirth());
        System.out.println("ClassName:" + className);
        System.out.println("TeacherName:" + teacherName);
        System.out.println("StartDate:" + startDate);
        System.out.println("EndDate:" + endDate);
    }

}
