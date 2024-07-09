package MyPractice.multi_level_inheritance.EmployeeManagementSystem;

public abstract class Manager extends Employee{

    // Define variable
    private final String department;

    // constructor to initialize all variables
    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    // method
    public String getDepartment(){
        return department;
    }

    public abstract void printHigherSalary();
}
