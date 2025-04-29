import java.util.Scanner;
public class doubleoperation{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double a;
	double b;
	double c;
	System.out.print("enter a :");
	a = s.nextDouble();
	System.out.print("enter b :");
	b = s.nextDouble();
	System.out.print("enter c :");
	c = s.nextDouble();
	
	double x = a + b *c;
	double y = a * b + c;
	double z = c + a / b;
	double d = a % b + c;
	
	System.out.println(" opr 1 :" + x + " opr 2 :" + y + "opr 3 :" + z + "opr 4 :" + d);
	}
}