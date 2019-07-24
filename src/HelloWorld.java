public class HelloWorld {
        public static void main(String[] args) {
            System.out.print("Hello, ");
            System.out.println("World!");
//            System.out.println("Hello, World!");

//      Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
            int myFavoriteNumber = 4;
            System.out.println(myFavoriteNumber);

//      Create a String variable named myString and assign a string value to it, then print the variable out to the console.
            String myString = "This is a string.";
            System.out.println(myString);

//      Change your code to assign a character value to myString. What do you notice?
//            myString = 'A';
            //THIS STATES IT IS AN INCOMPATIBLE TYPE (CHAR) BY THE COMPILER BEFORE RUNNING THE PROGRAM.

//      Change your code to assign the value 3.14159 to myString. What happens?
//            myString = 3.14159;
            //THIS FLAGS AS ERROR BY COMPILER AGAIN AS INCOMPATIBLE TYPE (DOUBLE).

//      Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
            long myNumber;
//            System.out.println(myNumber);
            //COMPILER ERROR DUE TO NUMBER NOT BEING INITIALIZED (SOMETHING ASSIGNED TO THE VARIABLE).

//      Change your code to assign the value 3.14 to myNumber. What do you notice?
//            myNumber = 3.14;
            //COMPILER ERROR (DOUBLE) => REQUIRES LONG.

//      Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            myNumber = 123L;
            System.out.println(myNumber);
            //THIS RAN THE VARIABLE MYNUMBER BUT THE OUTPUT WAS ONLY THE NUMBERS (123) NO 'L'.

//      Change your code to assign the value 123 to myNumber.
            myNumber = 123;
            System.out.println(myNumber);
            //OUTPUT IS 123

//      Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
            //3.14 DOES NOT COMPILE WHEN ASSIGNED TO A VARIABLE DECLARED AS LONG BECAUSE IT FALLS INTO THE DOUBLE DATA TYPE INSTEAD OF A LONG WHICH CAUSES CONFLICTS.

//      Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
            float floatMyNumber = myNumber;
            System.out.println(floatMyNumber);//THIS PRINTS AS (123.0)
//            floatMyNumber = 3.14;//THIS IS STILL AN INCOMPATIBLE TYPE DUE TO 3.14 BEING A DOUBLE.
//            double doubleFloatMyNumber = 3.14;
//            System.out.println(doubleFloatMyNumber);// this prints correctly
            //YOU CAN EITHER REASSIGN THE VARIABLE WITH WIDENING CONVERSION TO INCLUDE THE DOUBLE TYPE OR YOU CAN GO INTO THE ORIGINAL VARIABLE AND CHANGE IT THERE TO A DOUBLE.

//      Copy and paste the following code blocks one at a time and execute them:
//            int x = 5;
//            System.out.println(x++);//5
//            System.out.println(x);//6

//            int x = 5;
//            System.out.println(++x);//6
//            System.out.println(x);//6

//      What is the difference between the above code blocks? Explain why the code outputs what it does.
            //THE FIRST CODE BLOCK IS LOGGING X AND THEN INCREMENTING BY ONE AND THEN LOGGING ONE INCREASE TO X.
            //THE SECOND CODE BLOCK IS LOGGING X WITH THE INCREASE FIRST DUE TO IT BEING DECLARED IN THE LOG PRIOR TO THE VARIABLE; THEN IT LOGS THE VARIABLE INCREASED BECAUSE X IS TAKING ON THE NEW VARIABLE OF 6.

//      Try to create a variable named class. What happens?
//            double class = 13.5;
            //THROWS ERROR DUE TO EXPECTING A STATEMENT AFTER CLASS. CLASS IS RESERVED WORD NOT UTILIZED FOR VARIABLES PER JAVA RULES.

//      Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
            //HYPOTHESIS: {o}
            //RESULTS: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
            //	at HelloWorld.main(HelloWorld.java:73) --- THIS ERROR OCCURED DUE TO ATTEMPTING TO FIT A STRING INTO AN INT... THEY ARE DIFFERENT TYPES.

//      How is the above example different from the code block below?
//            int three = (int) "three";
            // THIS STILL THROWS THE SAME ERROR BUT DUE TO IT NOT BEING PLACED INTO AN OBJECT, THE COMPILER CATCHES IT IN THE SCRIPT BEING PRODUCED CURRENTLY VERSUS AFTER THE RUN. ERRORS: INCONVERTIBLE TYPES & CANNOT CAST JAVA.LANG.STRING TO INT.

//      Rewrite the following expressions using the relevant shorthand assignment operators:
//            int x = 4;
//            x = x + 5;
//            System.out.println(x);// 9

//            int x = 4;
//            x += 5;
//            System.out.println(x);// 9

//            int x = 3;
//            int y = 4;
//            y = y * x;
//            System.out.println(y);// 12

//            int x = 3;
//            int y = 4;
//            y *= x;
//            System.out.println(y);//12

//            int x = 10;
//            int y = 2;
//            x = x / y;
//            y = y - x;
//            System.out.println(x);// 5
//            System.out.println(y);// -3

//            int x = 10;
//            int y = 2;
//            x /= y;
//            y -= x;
//            System.out.println(x);// 5
//            System.out.println(y);// -3

//      What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
            //THE COMPILER WILL THROW AN ERROR IF YOU ASSIGN A NUMERICAL VALUE THAT IS LARGER THAN THE TYPE THAT IS ASSIGNED CAN HOLD. IF IT IS A SMALLER NUMERICAL VALUE THEN IT WILL RUN THE CODE.
            // DEPENDING ON THE DATA TYPE ASSIGNED, IT WILL REVERT BACK TO THE BEGINNING OF THAT DATA TYPE SET-- BACK TO THE FIRT NEGATIVE NUMBER (AKA THE LOWEST NUMBER IN THE SET).











        }
}
//error due to removing main class