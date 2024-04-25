package org.example.lesson11;

import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student tim = new Student("Tim");

        Student[] students = {new Student("John"), new Student("Paul"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
