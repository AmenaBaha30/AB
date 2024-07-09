package MyPractice.multi_level_inheritance.SchoolManagementSystem;

public class HeadTeacher extends Teacher {
  private final int  yearsOfExperience;
  //  Provide a constructor to initialize all variables

    HeadTeacher(String name, int age, String subject, int yearsOfExperience) {
        super(name, age, subject);
        this.yearsOfExperience = yearsOfExperience;
    }
    // method
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    @Override
    public String getSubject(){
        return super.getSubject()+" with " + yearsOfExperience + " years Of Experience ";
    }
}
/*
    Second Level of Inheritance:
        Create a derived class called HeadTeacher that extends Teacher.
        Add a private member variable: yearsOfExperience (type int).
        Provide a constructor to initialize all variables, including those in the base class.
        Implement a public method getYearsOfExperience() to access the years of experience.

        Method Implementation:
        In the HeadTeacher class, override the getSubject() method to provide a detailed description of
         the subject including experience.
 */