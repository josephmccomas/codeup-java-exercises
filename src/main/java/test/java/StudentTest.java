package test.java;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {


    @Test
    public void testGetName() {
        String student = "Tim";
        assertEquals("Tim", student);
    }

    @Test
    public void testGetGrades() {
        Integer[] expectedGrades = {50, 60, 80};
        Integer[] grades = {50, 60, 80};
        Assert.assertArrayEquals(expectedGrades, grades);
    }

    @Test
    public void testAddGrade() {
        List<Integer[]> grades = new ArrayList<>(Collections.singleton(new int[]{50, 60, 80}));
        grades.add(90);
        Assert.assertArrayEquals(Integer[]{50, 60, 80, 90}, grades);
    }
}
