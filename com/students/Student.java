package com.students;

// Define the Student class
public class Student {
    private int rollno;
    private String name;
    private String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // Override default toString method to a formatted string of Student object
    @Override
    public String toString() {
        return "Student [Roll Number: " + rollno + ", Name: " + name + ", Address: " + address + "]";
    }
    
}