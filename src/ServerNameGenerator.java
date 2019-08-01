import java.util.Random;

public class ServerNameGenerator {

    /*Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.*/

    public static String [] adjectiveArray = {"elegant", "fancy", "fit","flabby", "glamorous", "gorgeous", "muscular", "plain", "handsome", "magnificent"};
    public static String [] nounArray = {"cat", "hat", "bat", "ball", "wall", "window", "door", "floor", "roof", "sink"};

    /*Create a method that will return a random element from an array of strings.*/

     public static String randomElement (String [] array){
        int randomIndex = new Random().nextInt(array.length);
        return  array[randomIndex];
    }

    /*Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.*/

    public static void main(String[] args) {
        String noun = randomElement(nounArray);

        String adjective = randomElement(adjectiveArray);

        System.out.printf("Here is your hyphenated name: " + adjective + "-" + noun);
    }

}
