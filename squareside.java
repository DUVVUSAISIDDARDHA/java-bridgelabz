import java.util.Scanner;
public class squareside{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	double perimeter;
	System.out.print("enter perimeter:");
	perimeter=s.nextDouble();
	
    double side = perimeter/4;
	
	System.out.println(" Side is : " + side);
	}
}