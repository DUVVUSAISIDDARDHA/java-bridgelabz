package com.bridgelabz.inheritance;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void displayDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ravi", 20, "Maths");
        teacher.displayDetails();
        teacher.displayRole();

        Student student=new Student("Suresh", 20, "10th");
        student.displayDetails();
        student.displayRole();

        Staff staff=new Staff("Manish", 20, "Networking");
        staff.displayDetails();
        staff.displayRole();
    }
}
