package replit;

import java.util.Scanner;

public class Q_14 {

    public static void main(String[] args) {
        System.out.println(" What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String usrName = scanner.nextLine();
        if (usrName.equals("Daniel")){
            System.out.println("You are Daniel");
        } else {
            System.out.println("You are not Daniel");
        }

       /*
             Write a java program with following steps:
        I. Print the following messages in console.
        1. "What is your name: "
        II. Declare and store what the user enters into the variable after step I.
        1.  This variable should hold the value of what the user enters.
                III. Compare what the user enters using equals() method.
        1. Check if the name that user has entered is equal to "Daniel".
        2. If it is true, print "You are Daniel".
        3. else. printt "You are not Daniel".
                IV. Run your java program.
                ** Note: Please select the correct name and data type for the above variable. **
** Hint: Look at the below expected output. **
** Help: The method equals() accepts the below parameters:
        1. anotherObject, 	An Object, representing the other string to be
        compared.
        2. This method returns a boolean value:
        a. true - if the strings are equal
        b. false - if the strings are not equal
        Expected output
        You are not Daniel

        */

    }
}
