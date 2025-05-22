package com.bridgelabz.collections.mapinterface;

import com.bridgelabz.collections.queueinterface.Employee;

import java.util.*;

public class GroupObjectsByProperty {
    public static void main(String[] args){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> map = new HashMap<>();

        for(Employee emp : employees) {
            map.putIfAbsent(emp.getDesignation(), new ArrayList<>());
            map.get(emp.getDesignation()).add(emp);
        }

        System.out.println(map);

    }
}
