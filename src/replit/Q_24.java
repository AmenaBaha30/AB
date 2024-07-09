package replit;

public class Q_24 {
    public static void main(String[] args) {
        String str = "Welcome to TekSchool";
        int index = str.indexOf('e', 8);
        System.out.println(index);
    }
}
//    Write a java program with following steps:
//
//    I. Declare and store the following value to a variable.
//
//      1. "Welcome to TekSchool".
//    II. Find the first occurrence of the letter "e" in the above string.
//
//            1. The search for the specified character should start from index 8.
//    III. Print the first occurrence index of the specified character in console.
//
//    ** Note: Please select the correct data types for the above variables. **
//
//            ** Hint: Look at the below expected output. **
//
//            ** Help: The method indexOf() accepts the below parameters:
//
//            1. str: A String value, representing the string to search for.
//            2. fromIndex: 	An int value, representing the index position to start the search from.
//            3. char: 	An int value, representing a single character, e.g 'A', or a Unicode value.
//    HINT: An int value, representing the index of the first occurrence of the character in the string, if a character never occurs, the method returns -1.
//
//            **
//
//    expected output
//    12