import java.util.Scanner;
public class intoperation{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	int a;
	int b;
	int c;
	System.out.print("enter a :");
	a = s.nextInt();
	System.out.print("enter b :");
	b = s.nextInt();
	System.out.print("enter c :");
	c = s.nextInt();
	
	int x = a + b *c;
	int y = a * b + c;
	int z = c + a / b;
	int d = a % b + c;
	
	System.out.println(" opr 1 :" + x + " opr 2 :" + y + "opr 3 :" + z + "opr 4 :" + d);
	}
}

	