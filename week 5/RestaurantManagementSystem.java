package com.bridgelabz.inheritance;

class PersonDetails{
    private String name;
    private int id;

    public PersonDetails(String name, int id){
        this.name=name;
        this.id=id;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args){
        Chef chef=new Chef("Suresh", 1002, "Indian");
        chef.performDuties();
        chef.displayDetails();

        Waiter waiter=new Waiter("Harry", 1001, 2);
        waiter.performDuties();
        waiter.displayDetails();
    }
}
