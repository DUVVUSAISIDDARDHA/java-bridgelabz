import java.util.Scanner;
public class tempconversion{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	double celcius;
	System.out.print("enter celcius:");
	celcius = s.nextDouble();
	
	double Fahrenheit =  (celcius * 9/5) + 32;
	
	System.out.println(" farenheitResult :" + Fahrenheit);
	}
}
