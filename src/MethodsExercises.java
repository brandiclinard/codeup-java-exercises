import java.util.Scanner;


public class MethodsExercises {

    public static double addition(double num1, double num2){
       return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
       return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
       return num1 * num2;
    }

    public static double muliplicationLoop(double num1, int num2){
        double result = 0;
            for (int i = 0; i < num2; i++) {
                result += num1;
            }
            return result;
    }

    public static double multiplyNoOperator(double num1, double num2){   //- RECURSION
        if(num2 == 0)
            return 0;

        if(num2 > 0)
            return (num1 + multiplyNoOperator(num1, num2-1));

        if(num2<0)
            return -multiplyNoOperator(num1, -num2);

        return -1;
    }



    public static double division(double num1, double num2){
       return num1 / num2;
    }

    public static double modulus(double num1, double num2){
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
        System.out.println(getInteger(5,10));

            /*Calculate the factorial of a number.

Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and 10.
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.
*/

        System.out.println("Please enter a number from 1 to 10:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


    }
}
