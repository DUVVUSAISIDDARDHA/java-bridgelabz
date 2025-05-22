package com.bridgelabz.oops.levelone;

class FullTimeEmployee extends com.bridgelabz.encapsulation.Employee implements com.bridgelabz.encapsulation.Department {
    private float totalSalary;
    private String department;
    protected float bonus;

    public FullTimeEmployee(int employeeId, String employeeName, float baseSalary, float bonus) {
        super(employeeId, employeeName, baseSalary);
        this.bonus = bonus;
    }

    public float calculateSalary() {
        totalSalary = getBaseSalary() + bonus;
        return totalSalary;
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
