package replit;

public class Q_9 {
    public static void main(String[] args) {

        for (int i = 2; i <= 50; i++){
            boolean IsPrime  = true;
            for (int j = 2; j<i; j++){
                if (i % j == 0){
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime){
                System.out.println(i + " ");
            }
        }
//        I. Create a for loop to iterate from 2 to 50.
//        Initialize the loop variable i to 2.
//        Set the condition to run the loop while i is less than or equal to 50.
//        Increment the loop variable i by 1 after each iteration.
//                II. Inside the loop, create another for loop to check if i is prime.
//                Initialize the loop variable j to 2.
//        Set the condition to run the loop while j is less than i.
//                Increment the loop variable j by 1 after each iteration.
//                III. Check if i is divisible by j.
//                If it is, set a flag to false and break the inner loop.
//        If the flag remains true after the inner loop, print i.
//                Expected Output:
//        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

    }
}
