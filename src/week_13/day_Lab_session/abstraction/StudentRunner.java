package week_13.day_Lab_session.abstraction;

public class StudentRunner {
    public static void main(String[] args) {


        var studentOne = new Student("Amena", "Baha lastName", 20, "Engineer");
        var employeeObj = new Employee("Ayesha", "Rasa", 23, "Automation Engineer");

        studentOne.printInfo();
        employeeObj.printInfo();

    }
}
