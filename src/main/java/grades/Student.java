package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;
    private static int avjGrade = 0;
    static int sumGrade = 0;
    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
