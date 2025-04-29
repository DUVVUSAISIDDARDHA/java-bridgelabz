import java.util.Scanner;
public class tempconversioncelcius{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	double Fahrenheit;
	System.out.print("enter Fahrenheit:");
	Fahrenheit = s.nextDouble();
	
	double celcius =  (Fahrenheit - 32) * 5/9; 
	
	System.out.println(" celcius is :" + celcius);
	}
}
