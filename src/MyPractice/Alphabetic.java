package MyPractice;

public class Alphabetic {
    public static void main(String[] args) {
            int Alphabetic = 65;
                 //outer loop to handle rows
            for (int i = 0; i <= 5; i++) {
                //inner loop to handle column
                for (int j = 0; j <= i; j++) {

                    // print alphabet
                    final String s = ( Alphabetic + j) + "";
                  //  System.out.print(char)( Alphabetic +j) + "");

                    //print new line after each row;
                    System.out.println();


                }
            }
    }
}
