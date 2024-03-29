package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();


    public static void main(String[] args) {


        Student brandi = new Student("Brandi");

        brandi.addGrade(100);
        brandi.addGrade(90);
        brandi.addGrade(80);

        Student brittany= new Student("Brittany");

        brittany.addGrade(100);
        brittany.addGrade(75);
        brittany.addGrade(80);

        Student breanna= new Student("Breanna");

        breanna.addGrade(50);
        breanna.addGrade(75);
        breanna.addGrade(100);


        students.put("bclinard", brandi);
        students.put("bspears", brittany);
        students.put("bgonzales", breanna);

//        System.out.println("brandi.getGradeAverage() = " + brandi.getGradeAverage());
//        System.out.println("brandi.getGradeAverage() = " + brittany.getGradeAverage());

        System.out.println("Welcome!\n");
        showStudents();

        boolean cont = true;

        do {

            String key = input.getString("What student would you like to see more information on?");
//
            if (students.containsKey(key)) {// need to put into do while loop... get last of walk through notes from github
                System.out.println("Name: " + students.get(key).getName() + "- GitHub Username: " + key);
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the Github username of " + key);
            }
            cont = input.yesNo("Would you like to see another student?");
        }while(cont);
        System.out.println("Goodbye, and have a wonderful day!\n");


    }

    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username: students.keySet()){
            System.out.print(username + " | ");
        }
        System.out.println();
    }
}
