package com.rakovets.course.javabasics.practice.jcf.list;
import com.rakovets.course.javabasics.practice.jcf.SchoolClass;
import com.rakovets.course.javabasics.practice.jcf.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolClassTest {
    @Test
    void schoolClassTest() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Lee", "Aaker", 20, 7.0));
        students.add(new Student("Aby", "Davis", 19, 5.53));
        students.add(new Student("Karl", "Nicholson", 21, 9.0));
        students.add(new Student("Kaleb", "Andrews", 15, 3.0));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(new SchoolClass.StudentAgeComparator());
        assertEquals("21 20 19 15", schoolClass.getAges());
        students.sort(new SchoolClass.StudentAverageAnnualMarkComparator());
        assertEquals("9.0 7.0 5.53 3.0", schoolClass.getAverageMark());
        assertEquals("Nicholson",schoolClass.getBestStudent(students).getSurname());
    }
}
