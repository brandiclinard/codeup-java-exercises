public class ControlFlowExercises {
////    One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
////
////    Write a program that prints the numbers from 1 to 100.
////    For multiples of three: print “Fizz” instead of the number.
////    For the multiples of five: print “Buzz”.
////    For numbers which are multiples of both three and five: print “FizzBuzz”.
//    static void fizzBuzz(int num) {
//        for (int i = 1; i <= num; i++){
//            if (i % 15 == 0) {
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0){
//                System.out.println("buzz");
//            }else if (i % 3 == 0){
//                System.out.println("fizz");
//            }else{
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        fizzBuzz(50);
//    }
public static void main(String[] args) {
    /*Loop Basics

    While

    Create an integer variable i with a value of 5.
    Create a while loop that runs so long as i is less than or equal to 15
    Each loop iteration, output the current value of i, then increment i by one.
    Your output should look like this:

    5 6 7 8 9 10 11 12 13 14 15*/

    int i = 5;
    while( i<=15){
        System.out.println(i);
        i++;
    }




}
}
