package week_13.day_3;

public class Main {
    public static void main(String[] args) {
        // Store the firstName of 3 students
        // Store the lasName of 3 Students
        // Store the dateOfBirth of 3 Students

        var studentOne = new Student("Amena", "Baha","02/05/1999", "Spartans");
        var studentTwo = new Student("Ayesha", "Rasa", "02/13/1998", "Spartans");
        var studentThree = new Student("Zubaida", " Malikzay","05/03/1997", "Spartans");

        System.err.println(studentOne.getFirstName());
        System.err.println(studentTwo.getFirstName());
        System.err.println(studentThree.getFirstName());


        studentOne.printInfo();
        studentTwo.printInfo();
        studentThree.printInfo();



    }
}
