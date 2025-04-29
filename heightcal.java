import java.util.Scanner;
public class heightcal{
    public static void main(String[] args){
	
	int heightincm;
	
	Scanner s = new Scanner(System.in);
	System.out.print("Enter height");
	heightincm = s.nextInt();
	
	double heightininches = heightincm / 2.54;
	double feet =  heightininches / 12; 
    double inches =  heightininches % 12;
	
	System.out.println(" heightinfeet is : " + feet  + " \ninches is : " + inches);
	}
}
	
	