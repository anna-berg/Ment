package com.berg.homework512.streamHomework;

import java.util.List;

public class Student implements Comparable<Student> {

    private final String firstName;
    private final String lastName;
    private final int courseNumber;
    private final List<Integer> marks;

    record StudentRecord(
            List<String> fullNameByCourse,
            Double averageMarkByCourse) {
    }

    public Student(String firstName, String lastName, int courseNumber, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

    public double getAverageStudentMark() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFulName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseNumber=" + courseNumber +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return lastName.compareTo(o.lastName);
    }
}
