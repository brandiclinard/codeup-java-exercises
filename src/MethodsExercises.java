import java.util.Scanner;


public class MethodsExercises {

    public static int addition(int num1, int num2){
        int answer = num1 + num2;
//        System.out.println(answer);
        return answer;
    }

    public static int subtraction(int num1, int num2){
        int answer = num1 - num2;
//        System.out.println(answer);
        return answer;
    }

    public static int multiplication(int num1, int num2){
        int answer = num1 * num2;
//        System.out.println(answer);
        return answer;
    }

//    public static int muliplicationLoop(int num1){
//            for (int i = 0; i < 3; i++) {
//                System.out.println(num1 += num1);
//            }
//            return num1;
//    }

    public static int multiplyNoOperator(int num1, int num2){   //- RECURSION
        if(num2 == 0)
            return 0;

        if(num2 > 0)
            return (num1 + multiplyNoOperator(num1, num2-1));

        if(num2<0)
            return -multiplyNoOperator(num1, -num2);

        return -1;
    }



    public static int division(int num1, int num2){
        int answer = num1 / num2;
//        System.out.println(answer);
        return answer;
    }

    public static int modulus(int num1, int num2){
        int answer = num1 % num2;
//        System.out.println(answer);
        return answer;
    }


    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);

        do {
//            String message = "";
            System.out.print("Enter a number between" + min + " and " + max + ":");
            int userInput = scanner.nextInt();

            if (userInput < min) {
                System.out.println("Your number is too low. Please try again.");
            } else if (userInput > max) {
                System.out.println("Your number is too high. Please try again.");
            }else{
                System.out.println("You did it!");
            }
        }while(true);

//        int userInput = getInteger(1, 10);

    }




    public static void main(String[] args) {
        System.out.println(addition(2,3));   // 5
        System.out.println(subtraction(9,5));   // 4
        System.out.println(multiplication(5,6));   // 30
        System.out.println(division(100, 4 ));   // 25
//        division(4,0);//exception in thread (ArithmeticException / by zero)
        System.out.println( division(0,2));   // 0 - this works.
        System.out.println(modulus(100, 3));   // 1
        System.out.println(multiplyNoOperator(4,4));
//        System.out.println(muliplicationLoop(5));   //- not working appropriately
        System.out.println(getInteger(1,10));

    }
}
