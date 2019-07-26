import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {
        /*Loop Basics

        While

        Create an integer variable i with a value of 5.
        Create a while loop that runs so long as i is less than or equal to 15
        Each loop iteration, output the current value of i, then increment i by one.
        Your output should look like this:

        5 6 7 8 9 10 11 12 13 14 15*/

//            int i = 5;
//            while( i<=15){
//                System.out.print(i + " ");
//                i++;
//            }

        /*Do While

        -Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        -Alter your loop to count backwards by 5's from 100 to -10.
        -Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        2
        4
        16
        256
        65536*/

//        long i = 0;
//        do{
//            System.out.println(i);
//            i +=2;
//
//        }while(i <= 100);

//        i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        i = 2;
//        do{
//            System.out.println(i);
//            i*=i;
//        }while(i<=1000000);

        /*Refactor the previous two exercises to use a for loop instead.*/

            for (int i = 5; i <= 15; i++){
                System.out.print(i + " ");
            }

        //    for (int i=0; i<=100;i+=2){
        //        System.out.println(i);
        //    }

        //    for(int i=100; i>=-10; i-=5){
        //        System.out.println(i);
        //    }

    //        for(long i=2; i<=1000000; i*=i) {
    //            System.out.println(i);
    //        }
//        }

           /* One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        Write a program that prints the numbers from 1 to 100.
        For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”.*/
//        for (int i = 1; i <= 100; i++){
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

        /*Display a table of powers.

        -Prompt the user to enter an integer.
        -Display a table of squares and cubes from 1 to the value entered.
        -Ask if the user wants to continue.
        -Assume that the user will enter valid data.
        -Only continue if the user agrees to.

        Example Output:
        What number would you like to go up to? 5

        Here is your table!

                number | squared| cubed
                ------  | ------- | -----
                1       | 1        | 1
                2       | 4       | 8
               3       | 9        | 27
               4      | 16       | 64
               5      | 25       | 125

         */
//        Scanner scanner = new Scanner(System.in);
//
//        String choice = "y";
//
//        do {
//            System.out.println("Please enter an integer:");
//            int number = scanner.nextInt();
//
//            String header = "number | squared | cubed " + "\n"
//                    + "------- | -------- | -------";
//            System.out.println(header);
//
//
//            int squaredNumber = 0;
//            int cubedNumber = 0;
//
//            String row = "";
//            for (int i = 0; i <= number; i++) {
//
//                squaredNumber = i * i;
//                cubedNumber = i * i * i;
//
//                row = i + "        | " + squaredNumber + "       | " + cubedNumber;
//                System.out.println(row);
//            }
//            System.out.println("Do you wish to continue? (y/n): ");
//            choice = scanner.next();
//            System.out.println();
//
//        }while(!choice.equalsIgnoreCase("n"));

//        Walk through notes:
        squaresCubes();



        /*Convert given number grades into letter grades.
                -Prompt the user for a numerical grade from 0 to 100.
        Display the corresponding letter grade.
                -Prompt the user to continue.
        Assume that the user will enter valid integers for the grades.
        The application should only continue if the user agrees to.
        Grade Ranges:

        A : 100 - 88
        B : 87 - 80
        C : 79 - 67
        D : 66 - 60
        F : 59 - 0*/

//        String choice = "y";
//
//         do {
//             System.out.println("Let's convert your numerical grade to a letter grade. Please insert your numerical grade: ");
//             int numerical = scanner.nextInt();
//
//             if (numerical >= 97 && numerical <= 100) {
//                 System.out.println("A+");
//             }else if(numerical >=91 && numerical <=96){
//                 System.out.println("A");
//             }else if(numerical >=88 && numerical <=90) {
//                 System.out.println("A-");
//             }else if(numerical >= 86 && numerical <=87){
//                 System.out.println("B+");
//             }else if(numerical >=82 && numerical <=85){
//                 System.out.println("B");
//             } else if (numerical >= 80 && numerical <= 81) {
//                 System.out.println("B-");
//             }else if(numerical >= 76 && numerical <=79){
//                 System.out.println("C+");
//             }else if(numerical >= 71 && numerical <= 75){
//                 System.out.println("C");
//             }else if(numerical >= 67 && numerical <= 70) {
//                 System.out.println("C-");
//             }else if(numerical >= 65 && numerical <=66){
//                 System.out.println("D+");
//             }else if(numerical >=62 && numerical <=64) {
//                 System.out.println("D");
//             } else if (numerical >= 60 && numerical <= 66) {
//                 System.out.println("D-");
//             } else if (numerical >= 0 && numerical <= 59) {
//                 System.out.println("F");
//             }else {
//                 System.out.println("You did not enter numerical grade between 100 - 0.");
//             }
//             System.out.println("Do you wish to continue? (y/n): ");
//            choice = scanner.next();
//            System.out.println();
//
//         }while(!choice.equalsIgnoreCase("n"));
    }

    //WALK THROUGH NOTES:
    private static void squaresCubes(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");


    }
}
