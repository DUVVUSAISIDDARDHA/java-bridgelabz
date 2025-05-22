import java.util.Scanner;
public class Discounts{
    public static void main(String[] args){
	
	int fee;
	Scanner s = new Scanner(System.in);
	System.out.print("enter fee:");
	fee = s.nextInt();
	
	int Discount_percentage;
	
	System.out.print("enter discount perc:");
	
    Discount_percentage = s.nextInt();
	
	double discount = fee * (Discount_percentage)/100;
	double Total_fee = fee - discount;
	
	System.out.println("discount is:" + discount + " total fee is :" + Total_fee);
	}
}

	
	