public class Person {

    //    The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
    private String name;
    private Person(String name){
    this.name = name;
}

    //Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.
    public static void main(String[] args) {
//        Person gabriel = new Person("Gabriel");
//        Person patrick = new Person("Patrick");
//        System.out.println(gabriel.getName().equals(patrick.getName()));

        Person person1 = new Person("Gabriel");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//        System.out.println(person1 == person2);
        person2.setName("Patrick");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
//TODO: change the name field to the passed value
        this.name = "Patrick";
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }


}