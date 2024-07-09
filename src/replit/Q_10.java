package replit;

public class Q_10 {
    public static void main(String[] args) {
       int [] arr = {1, 2, 3, 4, 5};
       for (int i = arr.length-1; i >= 0; i--){
           System.out.println(arr [i] + " " );
       }


    }
}
/*
     I. Declare an integer array arr with some initial values (e.g., {1, 2, 3, 4, 5}).
                II. Create a for loop.
                Initialize the loop variable i to the last index of the array.
                Set the condition to run the loop while i is greater than or equal to 0.
        Decrement the loop variable i by 1 after each iteration.
                III. Inside the loop, print the value of arr[i].
        Expected Output:
        5 4 3 2 1
 */