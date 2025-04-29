import java.util.Scanner;
public class Totaldistance{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	String fromcity;
	String viacity;
	String tocity;
	double fromtovia;
	double viatofinalcity;
	double time_from_city_to_viacity;
	double time_via_city_to_city;
	
	System.out.print("enter fromcity :");
    fromcity = s.next();
	System.out.print("enter viacity :");
	viacity = s.next();
	System.out.print("enter tocity :");
	tocity = s.next();
	System.out.print("enter fromtovia :");
	fromtovia = s.nextDouble();
	System.out.print("enter viatofinalcity :");
	viatofinalcity = s.nextDouble();
	System.out.print("enter time from city to viacity :");
	time_from_city_to_viacity = s.nextDouble();
	System.out.print("enter time via city to city :");
	time_via_city_to_city = s.nextDouble();
	
	double total_distance = fromtovia + viatofinalcity;
	double total_time    = time_from_city_to_viacity + time_via_city_to_city;
	
	System.out.println(" total distance is " + total_distance + " total_time is :" + total_time);
	}
}

	
	
    	
	

	
	
