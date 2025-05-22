package com.bridgelabz.encapsulation;

import com.bridgelabz.oops.levelone.FullTimeEmployee;
import com.bridgelabz.oops.levelone.PartTimeEmployee;

import java.util.ArrayList;
interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}
abstract class Employee{
    protected int employeeId;
    protected String employeeName;
    private float baseSalary;
    public Employee(int employeeId, String employeeName, float baseSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.baseSalary=baseSalary;
    }
    public float getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary){
        this.baseSalary=baseSalary;
    }
    public void displayDetails(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+baseSalary);
    }
    abstract float calculateSalary();
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(1001, "Suresh", 100000, 10000));
        employees.add(new PartTimeEmployee(1002, "Ravi", 15000, 2, 500));

        for (Employee employee : employees) {
            employee.calculateSalary();
            ((Department) employee).assignDepartment(employee instanceof FullTimeEmployee ? "IT" : "Marketing");
            employee.displayDetails();
            System.out.println("Department: " + ((Department) employee).getDepartmentDetails());
            System.out.println("Salary: " + employee.calculateSalary() + "\n");
        }
    }
}
