package replit;

public class Q_20 {
    public static void main(String[] args) {
        String message = "Welcome To TekSchool";
        String firstPartOfTheMessage = message.substring(0, 11);
        String secondPartOfTheMessage = message.substring(11);
        String thirdPartOfTheMessage = secondPartOfTheMessage.toUpperCase();
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        System.out.println(firstPartOfTheMessage.concat(thirdPartOfTheMessage));

    }
}
//        Write a java program with following steps:
//
//        I. Declare and store the following value to a variable.
//
//        1. "Welcome To TekSchool".
//        II. Separate the first two parts of the message from the last part and store it in a variable.
//
//                1. Use the method substring() to separate "Welcome To" from "TekSchool"
//        and store it in a variable called firstPartOfTheMessage.
//                2. Use the method substring() to separate the "TekSchool" from "Welcome To"
//        and store it in a variable called secondPartOfTheMessage.
//                3. Declare another variable and name it thirdPartOfTheMessage and the
//        value of this variable should be the uppercase version of of the
//        secondPartOfTheMessage.
//        4. HINT: secondPartOfTheMessage.toUpperCase();
//        III. Print the above message by following the below stes:
//
//                1. Using the toUpperCase() method, print the uppercase version of the
//        message.
//          2. Using te toLowerCase() method, print the lowercase version of the
//        message.
//          4. Using the concat() method, print the firstPartOfTheMessage
//        concatenated with thirdPartOfTheMessage.
//        ** Note: Please select the correct name and data types for the above variables. **
//
//                ** Hint: Look at the below expected output. **
//
//                ** Help: The method toUpperCase() and toLowerCase() returns:
//
//                1. A String value, representing the new string converted to upper and
//        lower case.
//        Expected output
//        WELCOME TO TEKSCHOOL
//
//        welcome to tekschool
//
//        Welcome To TEKSCHOOL