package grades;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, HashMap<String, List>> students = new HashMap<>();
        students.put("John", "BigJohn", 70);
//        students.add("Grade", "70");
//        students.add("Grade", "80");
//        students.add("Grade", "90");

        students.put("Tim", "Timbo");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        students.put("Steve", "Stevealicious");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        students.put("Brian", "BoringBrian");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        System.out.println(students);

    }
}
// Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.