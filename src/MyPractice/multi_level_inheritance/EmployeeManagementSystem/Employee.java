package MyPractice.multi_level_inheritance.EmployeeManagementSystem;

public class Employee {

    // Define variables
    private final String name;
    private final String employeeId;
    private final double salary;

    // Constructor
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    // Method
    public String getName(){return name;}
    public String getEmployeeId(){return employeeId;}
    public double getSalary(){return salary;}

}
