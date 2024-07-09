package replit;

public class Q_18 {
    public static void main(String[] args) {
        int firstNumber = 35;
        double secondNumber = 20.5;
        int  thirdNumber = 15;
        int forthNumber = 10;
        boolean result1 = firstNumber > secondNumber;
        System.out.println(true);
        if (result1) {
            System.out.println("first number is bigger");
        }
        boolean resul2 = secondNumber + thirdNumber < firstNumber;
        System.out.println(resul2);
        if (!resul2) {
            System.out.println("first number is smaller");
        }

    }
}
//    store below value
//    a. firstNumber = 35
//
//    b. secondNumber = 20.5
//
//    c. thirdNumber = 15
//
//    d. forthNumber = 10
//
//    check is firstNumber>second Number is true or false;
//            if result is true print "first number is bigger"
//    check is second number+thirdNumber < firstNumber is true or false
//            if result is false print "first number is smaller"
//    expected Output
//    true
//
//    first number is bigger
//
//    false
//
//    first number is smaller
