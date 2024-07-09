package MyPractice.multi_level_inheritance.EmployeeManagementSystem;

public class SeniorManager extends Manager {
        // Declare
    private final int yearsOfExperience;

    // constructor to initialize all variables, including those in the base class.

    public SeniorManager(String name, String employeeId, double salary, String department, int yearsOfExperience) {
        super(name, employeeId, salary, department);
        this.yearsOfExperience = yearsOfExperience;
    }

    // method --> Getter
    public int getYearsOfExperience() {return yearsOfExperience;}

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        double bonus = 0.10 * yearsOfExperience * baseSalary;
        return baseSalary + bonus;
    }

    @Override
    public void printHigherSalary() {

    }
}