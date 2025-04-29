import java.util.Scanner;

public class KmstoMiles{
    public static void main(String[] args){
	
	int km;
	
	Scanner s = new Scanner(System.in);
	System.out.print("enter km :");
	km=s.nextInt();
	
	double miles = km / 1.6;
	
	System.out.println("km to miles :" + miles);
	}
}

	