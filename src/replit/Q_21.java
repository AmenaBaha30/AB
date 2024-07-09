package replit;

public class Q_21 {
    public static void main(String[] args) {
        String stringLength = "Welcome to TekSchool";
        System.out.println("The length of the message is: " +
                stringLength.length());

        System.out.println("The character stored at index 4 is: " +
                stringLength.charAt(4));
        System.out.println("The character stored at index 12 is: "
                + stringLength.charAt(12));
    }
}
//        Write a java program with following steps:
//
//        I. Declare and store the following value to a variable.
//
//          1. "Welcome to TekSchool".
//        II. Find the lenght of the above string and store it in a variable called stringLenght.
//
//        III. Declare another two variables and name it charAtIndexF and charAtIndexT.
//
//                1. By using the charAt() method, store the value stored at index 4 and
//        the above String.
//          2. By using the charAt() method, store the value stored at index 12 and
//        the above String.
//        IV. print the values stored in stringLenght, charAtIndexF and charAtIndexT in console.
//
//                ** Note: Please select the correct name and data types for the above variables. **
//
//                ** Hint: Look at the below expected output. **
//
//                ** Help: The method charAt() accepts the below parameters:
//
//                1. index, An int value representing the index of the character to return.
//                2. The first char value is at index 0. The index of string starts from 0.
//                3. If index is negative or not less than the length of the specified
//        string, then this method will return an error of:
//        IndexOutOfBoundsException.
//          4. Use the concatenation to concatenate the stored values in the
//        variables with the custom message. Pay attention to the expected
//                output
//        HINT: An index , representing a char value at the specified index of this string.
//        **
//        The character stored at index 4 is: o
//
//        The character stored at index 12 is: e