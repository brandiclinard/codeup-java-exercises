import java.util.Arrays;

public class ArraysExercises {

    private static Person [] addPerson( Person [] group, Person newMember){
        Person [] newGroup = Arrays.copyOf(group, group.length+1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }

    public static void main(String[] args) {

        /*What happens when you run the following code? Why is Arrays.toString necessary?*/

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);   //-- you print the identification tag for the array: [I@2d209079

        System.out.println(Arrays.toString(numbers));   //-- this is the correct method to actually print the array method by taking the Arrays model and applying the toString method.

        /*Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person  in the array.*/

        Person [] personArray;
        personArray = new Person [3];
        personArray[0] = new Person("Brittany");
        personArray[1] = new Person("Brandi");
        personArray[2]= new Person("Brandy");
        for (Person peep: personArray) {
            System.out.println(peep.getName());
        }

       /* Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.*/


       Person [] newGroup = addPerson(personArray, new Person("BooBoo"));
       for(Person peep : newGroup){
           System.out.println(peep.getName());
       }

    }

}
