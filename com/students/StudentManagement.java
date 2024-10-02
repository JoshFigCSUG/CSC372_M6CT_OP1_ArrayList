package com.students;

import java.util.ArrayList;
import java.util.Comparator;

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
        selectionSort(studentList, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student student : studentList) {
            System.out.println(student);
        }      

        // Sort by roll number using selectionSort method and SortByRollno comparator
        
    }

    // Generic selection sort method that takes a list and a comparator
    public static <T> void selectionSort(ArrayList<T> list, Comparator<T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Use the comparator to compare elements
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);

        }
    }
}
