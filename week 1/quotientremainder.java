import java.util.Scanner;
public class quotientremainder{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double a;
	double b;
	System.out.print("enter a:");
	a = s.nextDouble();
	System.out.print("enter b");
	b = s.nextDouble();
	
	double quotient = a/b;
	double remainder= a%b;
	
	System.out.println(" quotient is :" + quotient + "\n remainder is :" + remainder);
	}
}
