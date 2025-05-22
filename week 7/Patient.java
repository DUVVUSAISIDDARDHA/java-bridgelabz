package com.bridgelabz.collections.queueinterface;

class Patient implements Comparable<Patient> {
    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int compareTo(Patient other) {
        return other.priority - this.priority;
    }

}
