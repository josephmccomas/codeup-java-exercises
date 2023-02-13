public class Person {
    private String name;

    //    The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
    public Person(String name) {
        this.name = "";
    }
//


    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName() {
//TODO: change the name field to the passed value
        this.name = "Patrick";
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    //Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.
    public void main(String[] args) {
        Person name = new Person("Gabriel");
        System.out.println(getName());
    }
}