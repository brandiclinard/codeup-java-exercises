package util;

import java.util.Scanner;


public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //        String getString()
    public String getString() {
         return this.scanner.nextLine();
    }

    //        boolean yesNo()
    boolean yesNo() {
        String input = this.scanner.nextLine();
        if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    //        int getInt(int min, int max)
    public int getInt(int min, int max) {

        do {
            System.out.print("Enter a number between " + min + " and " + max + ":\n");
            int input = scanner.nextInt();

            if (input < min) {
                System.out.println("Your number is too low. Please try again.\n");
            } else if (input > max) {
                System.out.println("Your number is too high. Please try again.\n");
            } else {
                System.out.println("You did it!\n");
                return input;
            }
        } while (true);
    }


    //        int getInt()
    public int getInt() {
        return this.scanner.nextInt();
    }

    //        double getDouble(double min, double max)
    public double getDouble(double min, double max) {

        do {
            System.out.print("Enter a number between " + min + " and " + max + ":\n");
            double input = scanner.nextDouble();

            if (input < min) {
                System.out.println("Your number is too low. Please try again.\n");
            } else if (input > max) {
                System.out.println("Your number is too high. Please try again.\n");
            } else {
                System.out.println("You did it!\n");
                return input;
            }
        } while (true);
    }

    //        double getDouble()
    public double geteDouble() {
        return this.scanner.nextDouble();

    }


    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter a string:\n");
        System.out.println(input.getString());
        System.out.println("Please enter yes or no:\n");
        System.out.println(input.yesNo());
        System.out.println(input.getInt(5,20));
        System.out.println("Please enter an  integer type:\n");
        System.out.println(input.getInt());
        System.out.println(input.getDouble(14.5,20.5));
        System.out.println("Please enter a double type:\n");
        System.out.println(input.geteDouble());

    }

}