import java.util.Scanner;
public class distribution{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int chocholates;
	int children;
	System.out.print("enter num of choco");
	chocholates = s.nextInt();
	System.out.print("enter num of children");
	children = s.nextInt();
	double x = chocholates/children;
	double y = chocholates%children;
	System.out.println("The number of chocolates each child gets is" + x + "and the number of remaining chocolates are" + y);
	}
}

	
	