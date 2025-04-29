import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
	
	
	
	Scanner s = new Scanner(System.in);
	double a;
	System.out.print(" enter a : ");
	a = s.nextDouble();
	double b;
	System.out.print("enter b :");
	b = s.nextDouble();
	
	double add = a + b;
	double sub = a - b;
	double mult= a * b;
	double div = a / b;
	double mod = a % b;
	 
	System.out.println(" addition is :" + add + "\nsubstraction is ;" + sub + "\nmultiplication is ;" + mult + "\ndivision is :" + div + " \nmodulus is : " + mod);
    }
}
	
	