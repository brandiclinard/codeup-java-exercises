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

    public String getString (String prompt){
        System.out.println(prompt);
        return this.getString();
    }

    //        boolean yesNo()
    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return this.yesNo();
    }

    //        int getInt(int min, int max)
    public int getInt(int min, int max) {
        int input;

        try {

            do {
                System.out.print("Enter a number between " + min + " and " + max + ":\n");
                //            int input = scanner.nextInt();
                input=Integer.valueOf(getString());

                if (input < min) {
                    System.out.println("Your number is too low. Please try again.\n");
                } else if (input > max) {
                    System.out.println("Your number is too high. Please try again.\n");
                } else {
                    System.out.println("You did it!\n");
                    return input;
                }
            } while (true);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("You did not input an integer. Please try again");
            return getInt(min, max);
        }
    }

//    Integer.valueOf(String s);

//    Double.valueOf(String s);


    //        int getInt()
    public int getInt() {
        try {
            return this.scanner.nextInt();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("You did not enter an integer. Please try again.");
            return getInt();
        }
    }

    //        double getDouble(double min, double max)
    public double getDouble(double min, double max) {
        double input;

        try {

            do {

                System.out.print("Enter a number between " + min + " and " + max + ":\n");
//                double input = scanner.nextDouble();
                input = Double.valueOf(getString());

                if (input < min) {
                    System.out.println("Your number is too low. Please try again.\n");
                } else if (input > max) {
                    System.out.println("Your number is too high. Please try again.\n");
                } else {
                    System.out.println("You did it!\n");
                    return input;
                }
            } while (true);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("You did not enter an double. Please try again.");
            return getDouble(min, max);
        }
    }

    //        double getDouble()
    public double getDouble() {
        try {
            return this.scanner.nextDouble();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("You did not enter a double. Please try again.");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        try {
            System.out.println(prompt);
            return this.getDouble();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("You did not enter a double. Please try again.");
            return getDouble();
        }
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
        System.out.println(input.getDouble());
    }

}