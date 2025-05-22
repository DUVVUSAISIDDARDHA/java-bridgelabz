import java.util.Scanner;
public class yardsandmiles{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	
	double feet;
	System.out.print("enter feet : ");
    feet = s.nextDouble();
	
	
    double distance_in_yards = feet/3;
    double distance_in_miles = distance_in_yards/1760;
    
    System.out.println(" d in yards :" + distance_in_yards + "\n distance_in_miles :" + distance_in_miles);
    }
}
	
	