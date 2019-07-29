import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        /*Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.*/

        //--MY ATTEMPT:

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Would you like to meet Bob? (Y/N)");
//        String answer = scanner.nextLine();
//
//        if (answer.equalsIgnoreCase("y")) {
//            System.out.println("Bob: Hello, I am Bob The Builder.");
//            do {
//                String response = scanner.nextLine();
//
//                    if (response.endsWith("b")) {
//                        System.out.println("Bob: Whatever.");
////                        response = scanner.nextLine();
////                        String angry = scanner.nextLine();
////                        if (angry.endsWith("!")) {
////                            System.out.println("Bob: Whatever.");
////                            angry = scanner.nextLine();
////                        }
//                    }else if (response.endsWith("!")) {
//                        System.out.println("Bob: Whoa, chill out!");
////                        response = scanner.nextLine();
//                    } else if (response.endsWith("?")) {
//                        System.out.println("Bob: Sure.");
////                        response = scanner.nextLine();
//                    } else if (response.endsWith(".")) {
//                        System.out.println("Bob: Okay.");
////                        response = scanner.nextLine();
//                    } else if (response.equalsIgnoreCase("bye")) {
//                        System.out.println("Bob: Goodbye.");
//                    }
//                    response = scanner.nextLine();
////                System.out.println("Would you like to keep talking to Bob?");
////                    answer = scanner.nextLine();
//
//            } while (!answer.equalsIgnoreCase("n")) ;
//        }else{
//            System.out.println("He didn't want to meet you anyway.");
//        }

        //--WALK THROUGH NOTES:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bob is eating cereal...");

        do {
            String message = scanner.nextLine();

            if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if(message.equalsIgnoreCase("bye") || message.equalsIgnoreCase("bye.")){
                System.out.println("Bob continues eating cereal...");
                break;
            }else {
                System.out.println("Whatever.");
            }
        }while(true);
    }
}

