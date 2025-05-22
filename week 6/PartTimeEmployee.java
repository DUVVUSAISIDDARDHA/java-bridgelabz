package com.bridgelabz.oops.levelone;

class PartTimeEmployee extends com.bridgelabz.encapsulation.Employee implements com.bridgelabz.encapsulation.Department {
    protected int overTimeWorkingHours;
    protected float salaryPerHour;
    private float totalSalary;
    private String department;

    public PartTimeEmployee(int employeeId, String employeeName, float baseSalary, int workingHours, float salaryPerHour) {
        super(employeeId, employeeName, baseSalary);
        this.overTimeWorkingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
    }

    public float calculateSalary() {
        totalSalary = getBaseSalary() + (overTimeWorkingHours * salaryPerHour);
        return totalSalary;
    }

    public void assignDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentDetails() {
        return department;
    }
}
