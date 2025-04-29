import java.util.Scanner;
public class areaoftriangle{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	
	double base;
	double height;
	
	System.out.print("enter base :");
	base = s.nextDouble();
	
	System.out.print("enter height :");
	height = s.nextDouble();
	
	
	double area_of_triangle = 0.5 *(base * height);
	
	System.out.println(" area of triangle is :" + area_of_triangle);
	}
}
