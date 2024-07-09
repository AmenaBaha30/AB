package week_13.day_Lab_session.abstraction;

public class EmployeeRunner {
    public static void main(String[] args) {

        var employeeOne = new Employee("Amena", "Baha", 68, "Engineer");
        // employeeOne.setFirstName("Amena");
        // Print the information of the user
        employeeOne.printInfo();
    }
}
