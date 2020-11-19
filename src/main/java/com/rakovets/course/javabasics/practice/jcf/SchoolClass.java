package com.rakovets.course.javabasics.practice.jcf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
     private ArrayList<Student> students;

    public SchoolClass(ArrayList<Student> students) {
        this.students = students;
    }

    public static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge() - o1.getAge();
        }
    }

    public static class StudentAverageAnnualMarkComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o2.getAverageAnnualMark(), o1.getAverageAnnualMark());
        }
    }

    public class StudentNameAndSurnameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        }
    }

    public String getAverageMarks() {
        String result = "";
        for (Student student : students) {
            result += student.getAverageAnnualMark() + " ";
        }
        return result.trim();
    }

    public Student getBestStudent(ArrayList students) {
        students.sort(new StudentAverageAnnualMarkComparator());
        return (Student) students.get(0);
    }

    public String getAges() {
        String result = "";
        for (Student student : students) {
            result += student.getAge() + " ";
        }
        return result.trim();
    }

    public List<Student> getStudents() {
        return students;
    }
}
