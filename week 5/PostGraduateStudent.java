package com.bridgelabz.inheritance;

class PostGraduateStudent extends com.bridgelabz.constructors.Student {

    PostGraduateStudent(String name, int rollNumber, double CGPA) {
        super(name, rollNumber, CGPA);
    }

    public void displayDetails(double CGPA) {
        System.out.println("Student  name: " + super.name);
        System.out.println("Student roll number(protected) is directly accessed from parent class: " + super.rollNumber);
        System.out.println("Student CGPA accessed using getters : " + CGPA);
    }
}
