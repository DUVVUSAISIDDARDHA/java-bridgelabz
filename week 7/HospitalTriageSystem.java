package com.bridgelabz.collections.queueinterface;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            Patient patient=queue.poll();
            System.out.println(patient.getName());
        }
    }
}
