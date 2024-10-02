# CSC372_M6CT_OP1_ArrayList
 CSC372_M6CT_OP1_ArrayList Selection Sort

# Student Management System

This is a simple Java program that demonstrates basic object-oriented programming concepts and sorting algorithms. It manages a list of students, allowing you to sort them by name or roll number.

## Features

* **Student Class:** Represents a student with attributes like roll number, name, and address.
* **Sorting:** Implements selection sort to sort students by name or roll number using custom comparators (`SortByName` and `SortByRollno`).
* **Data Management:** Uses an `ArrayList` to store and manage student data.

## How to Run

1. **Compile:** Compile the Java files using a Java compiler (like `javac`).
   ```bash
   javac com/students/*.java
   ```

2. **Run:** Execute the `StudentManagement` class.
   ```bash
   java com.students.StudentManagement
   ```

## Code Overview

* **`Student.java`:** Defines the `Student` class with attributes, constructors, getters, setters, and a `toString()` method.
* **`SortByName.java`:** Implements the `Comparator` interface to compare students by name.
* **`SortByRollno.java`:** Implements the `Comparator` interface to compare students by roll number.
* **`StudentManagement.java`:** Contains the `main` method to create student objects, add them to an `ArrayList`, and sort the list using the selection sort algorithm and custom comparators.

## Example Usage

The program will output the following:

```
Original List:
Student [Roll Number: 9, Name: Gary, Address: 140 Steele St]
Student [Roll Number: 3, Name: Ignacio, Address: 1600 California St]
Student [Roll Number: 6, Name: Clementine, Address: 2500 E Colfax Ave]
...

Sorted by Name:
Student [Roll Number: 4, Name: Allen, Address: 371 E Alameda Ave]
Student [Roll Number: 10, Name: Brittany, Address: 5560 N. Tower Rd]
Student [Roll Number: 6, Name: Clementine, Address: 2500 E Colfax Ave]
...

Sorted by Roll Number:
Student [Roll Number: 1, Name: Jesha, Address: 4490 Peoria St]
Student [Roll Number: 2, Name: Dereck, Address: 3600 W 32nd Ave]
Student [Roll Number: 3, Name: Ignacio, Address: 1600 California St]
...
```

## Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Encapsulation
* Custom Comparators
* Sorting Algorithms (Selection Sort)
* Generics
* ArrayList
