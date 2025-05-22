import java.util.Scanner;
public class numbercheck{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	double number;
	System.out.print("enter number:");
	number = s.nextDouble();
	
	if(number > 0){
	System.out.println("positive");}
	if(number < 0){
	System.out.println("negitive");}
	else{
	System.out.println("num is zero");}
	}
}

	
	