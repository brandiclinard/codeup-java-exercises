public class Person {

    private String name;// not accessible to other classes

    public Person(String name){
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("Hello, my name is %s%n", this.name);
    }

    public static void main(String[] args){

        //--Testing out the above methods.
        Person cody = new Person("Cody the Duck");
        System.out.println(cody.getName());
        cody.setName("Cody the Duck");
        cody.sayHello();
        Person moomoo = new Person("MooMoo the Cow");
        moomoo.setName("MooMoo the Cow");
        System.out.println(moomoo.getName());
        moomoo.sayHello();

//        //--1st code block: hypothesis:
//        Person person1 = new Person("John");  //--sets person1 to john
//        Person person2 = new Person("John");  //--sets person2 to john
//        System.out.println(person1.getName().equals(person2.getName()));   //--prints john because it is equal-- result: printed true because they hold the same value in string
//        System.out.println(person1 == person2);   //--prints john because it is equal-- result: printed false because they do not have the same origin so they are different

//        //--2nd code block: hypothesis:
//        Person person1 = new Person("John");   //--sets person1 to john
//        Person person2 = person1;   //--sets person2 to john
//        System.out.println(person1 == person2);   //--prints true-- result: printed true due to person2 coming from the same origin due to being reassigned vs making a new object

        //--3rd code block: hypothesis:
        Person person1 = new Person("John");   //--sets person1 to john
        Person person2 = person1;   //--reassigns person2 to john (same as person1)
        System.out.println(person1.getName());   //--gets name john-- result: prints john due to person being john
        System.out.println(person2.getName());   //--gets name john-- result: prints john due to person john being reassigned to person2
        person2.setName("Jane");   //--person2 name set to jane
        System.out.println(person1.getName());   //--gets name john--result: prints jane due to person2 and person1 being set equivalent to each other
        System.out.println(person2.getName());   //--gets name jane-- result: prints jane due to person2 being resetting name to jane
    }
}
