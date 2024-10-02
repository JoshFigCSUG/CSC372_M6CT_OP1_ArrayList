package com.students;

import java.util.ArrayList;

public class StudentManagement {

    public static void main(String[] args) {
        // Create ArrayList to hold Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Create 10 Student objects and add them to the list
        studentList.add(new Student(9, "Gary", "140 Steele St"));
        studentList.add(new Student(3, "Ignacio", "1600 California St"));
        studentList.add(new Student(6, "Clementine", "2500 E Colfax Ave"));
        studentList.add(new Student(2, "Dereck", "3600 W 32nd Ave"));
        studentList.add(new Student(1, "Jesha", "4490 Peoria St"));
        studentList.add(new Student(10, "Brittany", "5560 N. Tower Rd"));
        studentList.add(new Student(7, "Edith", "7400 E 29th Ave"));
        studentList.add(new Student(5, "Harper", "745 Colorado Blvd"));
        studentList.add(new Student(8, "Francisco", "820 S Monaco Pkwy"));
        studentList.add(new Student(4, "Allen", "371 E Alameda Ave"));

        System.out.println("Original List:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort by name using selectionSort method and SortByName comparator
        

        // Sort by roll number using selectionSort method and SortByRollno comparator
        
    }
}
