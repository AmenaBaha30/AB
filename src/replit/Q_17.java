package replit;

public class Q_17 {
    public static void main(String[] args) {
//        Declare below variables and assign values to them. (Choose proper datatype)
//        firstNumber = 30;
//
//        secondNumber = 7.5;
//
//        thirdNumber = 5.5;
//
//        forthNumber= 11.5;
//
//        fifthNumber = 5.5;
//
//        Find sum of below varaibles.
//                secondNumber
//
//                thirdNumber
//
//        forthNumber
//
//                fifthNumber
//
//        check sum of step 2 is equal to firstNumber and print the result.
//
//        check sum of step 2 is less than firstNumber and print the result.
//
//        check sum of step 2 is greater than firstNumber and print the result.
//
//        Expected Output
//        true
//
//        false
//
//        false
//

        int firstNumber = 30;
        double secondNumber = 7.5;
        double thirdNumber = 5.5;
        double forthNumber = 11.5;
        double fifthNumber = 5.5;
        double sum_of_variables = secondNumber + thirdNumber + forthNumber + fifthNumber;
        boolean isEqual = sum_of_variables == firstNumber;
        System.out.println(isEqual);
        boolean isLessThan = sum_of_variables < firstNumber;
        System.out.println(isLessThan);
        boolean isGreaterThan = sum_of_variables > firstNumber;
        System.out.println(isGreaterThan);
    }

}

