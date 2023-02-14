import java.util.Arrays;

public class ArraysExercises {

    //        Create an array that holds 3 Person objects.
    //        Assign a new instance of the Person class to each element.
    static String [] people = {"John", "Tim", "Bob"};

    public static void main(String[] args) {
//        int [] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        Iterate through the array and print out the name of each person in the array.
        System.out.println(Arrays.toString(people));
addPeople();
    }
//        Create a static method named addPerson.
//        It should accept an array of Person objects, as well as a single person object to add to the passed array.
//        It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static String[] addPeople(){
        String tom = "Tom";
        String [] morePeople = Arrays.copyOf(people, 4);
        for (int i = 0; i < people.length; i++) {
            morePeople[i] = people[i];
            morePeople[3] = tom;
        }
        System.out.println(Arrays.toString(morePeople));
        return morePeople;

    }
}
