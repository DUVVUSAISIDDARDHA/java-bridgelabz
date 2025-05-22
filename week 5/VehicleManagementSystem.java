package com.bridgelabz.inheritance;

class VehicleDetails{
    private float maxSpeed;
    private String model;

    public VehicleDetails(float maxSpeed, String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    public void displayDetails(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Model: "+model);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle=new ElectricVehicle(150, "BMW", 100);
        PetrolVehicle petrolVehicle=new PetrolVehicle(100, "Honda", 30);

        electricVehicle.displayDetails();
        electricVehicle.charge();

        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
