import java.util.Scanner;
public class roundsintriangle{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int side1;
	int side2;
	int side3;
	int distance = 5000;
	
	System.out.print("enter side1 :");
	side1 = s.nextInt();
	System.out.print("enter side2 :");
	side2 = s.nextInt();
	System.out.print("enter side3 :");
	side3 = s.nextInt();
	
	int perimeter = side1+side2+side3;
	
	int total_rounds = perimeter/distance;
	System.out.println("perimeter is :" + perimeter + " total rounds are :" + total_rounds);
	}
}