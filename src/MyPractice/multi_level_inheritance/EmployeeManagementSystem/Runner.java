package MyPractice.multi_level_inheritance.EmployeeManagementSystem;

public class Runner {
    public static void main(String[] args) {

        SeniorManager seniorManagerObj = new SeniorManager("Amena", "A2009",
                80000.0, "Engineer", 10);

        System.out.println("Employee Name:" + seniorManagerObj.getName());
        System.out.println("Employee ID:" + seniorManagerObj.getEmployeeId());
        System.out.println("Employee Salary:" + seniorManagerObj.getSalary());
        System.out.println("Employee Department:" + seniorManagerObj.getDepartment());
        System.out.println("Employee Years Of Experience :" + seniorManagerObj.getYearsOfExperience());

    }

}
