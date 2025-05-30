package com.bridgelabz.encapsulation;

import com.bridgelabz.inheritance.Discountable;
import com.bridgelabz.inheritance.FoodItem;
import com.bridgelabz.inheritance.NonVegItem;
import com.bridgelabz.inheritance.VegItem;

import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        ArrayList<FoodItem> foodItems=new ArrayList<>();
        foodItems.add(new VegItem("Paneer", 100, 2));
        foodItems.add(new NonVegItem("Chicken", 200, 3));

        for(FoodItem foodItem:foodItems) {
            foodItem.getItemDetails();
            foodItem.calculateTotalPrice();
            ((Discountable) foodItem).getDiscountDetails();
            ((Discountable) foodItem).applyDiscount();
        }
    }
}