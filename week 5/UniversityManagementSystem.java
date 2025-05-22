package com.bridgelabz.constructors;

import com.bridgelabz.inheritance.PostGraduateStudent;

import java.util.Scanner;

class Student{
    protected String name;
    public int rollNumber;
    private double CGPA;
    Student(String name, int rollNumber, double CGPA){
        this.name = name;
        this.rollNumber = rollNumber;
        this.CGPA = CGPA;
    }
    public void modifyCgpa(double CGPA){
        this.CGPA = CGPA;
    }
    public double getCgpa(){
        return this.CGPA;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name: ");
        String name=scanner.nextLine();
        System.out.println("Student roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Student CGPA: ");
        double CGPA=scanner.nextDouble();
        PostGraduateStudent postGraduateStudent = new PostGraduateStudent(name,rollNumber,CGPA);
        System.out.println("\nStudent details: ");
        postGraduateStudent.displayDetails(CGPA);
        postGraduateStudent.modifyCgpa(9.0);
        double newCGPA= postGraduateStudent.getCgpa();
        System.out.println("\nStudent details after modification: ");
        postGraduateStudent.displayDetails(newCGPA);
        scanner.close();
    }
}