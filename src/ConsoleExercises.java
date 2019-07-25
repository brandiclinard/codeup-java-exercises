import java.util.Scanner;
import java.text.DecimalFormat;


public class ConsoleExercises {
    public static void main(String[]args){
        double pi = (double) Math.round(3.14159 * 100) / 100D;
        // Output the following: The value of pi is approximately 3.14.

        System.out.format("The value of pi is approximately " + pi + ".%n");

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //What happens if you input something that is not an integer?
            //--ERROR OCCURS. IT STATES INPUT MISMATCH EXCEPTION.

//        System.out.print("Please enter three words:");
//        String wordOne = scanner.next();
//        System.out.println("Your first word was: " + wordOne);
//        String wordTwo = scanner.next();
//        System.out.println("Your second word was: " + wordTwo);
//        String wordThree = scanner.next();
//        System.out.println("Your third word was: " + wordThree);
        //What happens if you enter less than 3 words?
            //-- IT WILL ONLY RUN UPTO THE AMOUNT OF WORDS INPUT AND OUTPUT THE INFORMATION ONLY FOR THAT DESIGNATED AMOUNT. YOUR CONSOLE REMAINS RUNNING!!!! (until you input enough words)
        //What happens if you enter more than 3 words?
            //--PROCESS RUNS THROUGH THREE WORDS AND THEN DOES NOT INTAKE ANYMORE OR PRODUCE PRODUCTS FOR ANYTHING OUTSIDE OF ITS PARAMETERS.

//        System.out.print("Please enter a sentence:");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

//        System.out.print("Please enter a sentence:");
//        String sentence = scanner.next();
//        System.out.println(sentence);
        //do you capture all of the words?
            //-- YES ALL WORDS IF YOU UTILIZE NEXTLINE. IF YOU UTILIZE NEXT THEN YOU ONLY GET THE FIRST WORD BACK FROM THE SENTENCE.

        System.out.println("Please enter a length for codeup classrooms:");
        String length = scanner.nextLine();
//        Integer resultLength = Integer.valueOf(length);
//        Integer resultLength = Integer.valueOf(length);
        Float resultLength = Float.parseFloat(length);
        System.out.println(resultLength);


        System.out.println("Please enter a width for codeup classrooms:");
        String width = scanner.nextLine();
//        Integer resultWidth = Integer.valueOf(width);
        Float resultWidth = Float.parseFloat(width);
        System.out.println(resultWidth);

        System.out.println("Please enter the height for codeup classrooms:");
        String height = scanner.next();
        Float resultHeight = Float.parseFloat(height);
        System.out.println(resultHeight);

//        int area = resultLength * resultWidth;
//        int perimeter = (resultLength + resultWidth) * 2;
//        int volume = resultLength * resultWidth * resultHeight;

        float area = resultLength * resultWidth;
        float perimeter = (resultLength + resultWidth) * 2;
        float volume = resultLength * resultWidth * resultHeight;


        System.out.println("The area of the classroom is : " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        System.out.println("The volume of the classroom is: " + volume);

    }


}
