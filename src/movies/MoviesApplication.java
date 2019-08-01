package movies;

import java.util.Arrays;
import java.util.Scanner;

//import static java.util.Arrays.sort;
import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {


//        Movie[] findAll
    Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to see a full list of our movies? Y/N\n");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("Y"))
            for(Movie mov: findAll()){
    //            Arrays.sort(findAll());
                String title = mov.getName();
                String category = mov.getCategory();
                System.out.printf("Movie: %s, Type: %s%n", title, category);
            }
        else
            System.out.println("Maybe next time.\n");

        System.out.println("\nWould you like to see our movies by category? Y/N\n");
        input = scanner.nextLine();
//        for(Movie mov: findAll()){
//            String category = mov.getCategory();
//            String title = mov.getName();
//            System.out.printf("Type: %s, Movie: %s%n", category, title);
//        }
        if(input.equalsIgnoreCase("Y"))
            System.out.println("Please choose a category- animated, drama, musical, scifi, comedy, or horror:\n");// use loops instead and then search for that specific one in the get category and display it... switch case optional
            input=scanner.nextLine();

            for (Movie mov : findAll()) {
                String category = mov.getCategory();
                String title = mov.getName();
                if (input.equalsIgnoreCase("animated")) {
                    category.equals("animated");
                    System.out.printf("%s: %s%n", category,title);
                }else if (category.equalsIgnoreCase("drama")){
                    System.out.printf("%s: %s%n", category,title);
                }else if (category.equalsIgnoreCase("musical")){
                    System.out.printf("%s: %s%n", category,title);
                }else if(category.equalsIgnoreCase("scifi")){
                    System.out.printf("%s: %s%n", category,title);
                }else if(category.equalsIgnoreCase("comedy")){
                    System.out.printf("%s: %s%n", category,title);
                }else if(category.equalsIgnoreCase("horror")){
                    System.out.printf("%s: %s%n", category,title);
                }else{
                    System.out.println("We do not have that movie category.");
                }
            }
    }
}
