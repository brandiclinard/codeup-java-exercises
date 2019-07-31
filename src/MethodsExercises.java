import java.util.Scanner;


public class MethodsExercises {

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double muliplicationLoop(double num1, int num2) {
        double result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }

    public static double multiplyNoOperator(double num1, double num2) {   //- RECURSION
        if (num2 == 0)
            return 0;

        if (num2 > 0)
            return (num1 + multiplyNoOperator(num1, num2 - 1));

        if (num2 < 0)
            return -multiplyNoOperator(num1, -num2);

        return -1;
    }


    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        do {
            System.out.print("Enter a number between " + min + " and " + max + ":\n");
            userInput = scanner.nextInt();

            if (userInput < min) {
                System.out.println("Your number is too low. Please try again.\n");
            } else if (userInput > max) {
                System.out.println("Your number is too high. Please try again.\n");
            } else {
                System.out.println("You did it!\n");
                break;
            }
        } while (true);
        return userInput;
    }


    // walk through notes:

//    public static int getInteger(int min, int max){// -- recursion method
//
//        int answer;
//        Scanner scanner = new Scanner(System.in);
//
//        answer = scanner.nextInt();
//        if (answer < min) {
//            System.out.println("Too low.");
//            return getInteger(min, max);
//        } else if (answer > max){
//            System.out.println("Too high.");
//            return getInteger(min, max);
//        }else{
//            System.out.println("Mission accomplished!");
//            return answer;
//        }
//
////        return answer;
//}

/*Calculate the factorial of a number.

Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and 10.
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.

Bonus

Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
Use recursion to implement the factorial.
*/

//    public static void factorialGame() {
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            int fact = getInteger(1, 10);
//
//            factorialChart(fact);
//
//            System.out.println("Want to play again?");
//            if (!scanner.nextLine().toUpperCase().contains("Y")) return;
//        } while (true);
//    }
//
//    public static void factorialChart(int num){
//
//        long factorial = 1;
//
//        for(int i = 1; i <= num; i ++){
//            factorial = 1;
//            System.out.print(i + "! = ");
//            for (int j = 1; j <= i; j++){
//                System.out.println(j );
//                if (j !=i ) System.out.println(" x ");
//                else for(int k = 1; k <= (num-i); k++)
//                    System.out.println("    ");
//                factorial *= j;
//            }
//            System.out.println(" = " + factorial);
//        }
//    }

/*Create an application that simulates dice rolling.

Ask the user to enter the number of sides for a pair of dice.
Prompt the user to roll the dice.
"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
Use static methods to implement the method(s) that generate the random numbers.
Use the .random method of the java.lang.Math class to generate random numbers.*/
public static int rollDie (int sides){
    return (int) Math.ceil(Math.random() * sides);
}

public static void rollDice() {
    System.out.println("Enter the number of sides for a pair of dice?");
    int sides = getInteger(4,20);
    int die1 = rollDie(sides);
    int die2 = rollDie(sides);
    System.out.printf("You rolled a %d and a %d.%n", die1, die2 );

}















    /*Game Development 101

Welcome to the world of game development!

You are going to build a high-low guessing game. Create a class named HighLow inside of src.

The specs for the game are:

Game picks a random number between 1 and 100.
Prompts user to guess the number.
All user inputs are validated.
If user's guess is less than the number, it outputs "HIGHER".
If user's guess is more than the number, it outputs "LOWER".
If a user guesses the number, the game should declare "GOOD GUESS!"
Hints

Use the random method of the java.lang.Math class to generate a random number.
Bonus

Keep track of how many guesses a user makes.
Set an upper limit on the number of guesses.*/







    public static void main(String[] args) {
        System.out.println(addition(2,3));   // 5
        System.out.println(subtraction(9,5));   // 4
        System.out.println(multiplication(5,6));   // 30
        System.out.println(division(100, 4 ));   // 25
        System.out.println(division(4,0));//exception in thread (ArithmeticException / by zero)-- returns infinity when numbers set to double.
        System.out.println( division(0,2));   // 0 - this works.
        System.out.println(modulus(100, 3));   // 1
        System.out.println(multiplyNoOperator(-4,4));   // 16
        System.out.println(muliplicationLoop(5.5, 2));   //- second parameter must be positive and an int in order for the code to work.
//        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
//        factorialGame();
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
        rollDice();

    }


}
