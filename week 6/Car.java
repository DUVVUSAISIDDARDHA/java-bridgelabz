package com.bridgelabz.oops.levelone;

class Car extends Vehicle implements Insurable {
    private int insuranceAmount = 200;

    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public double calculateInsurance() {
        return rentalRate + insuranceAmount;
    }

    public String getInsuranceDetails() {
        return "Insurance company: ICICI\nInsurance Amount per day: " + insuranceAmount;
    }
}
