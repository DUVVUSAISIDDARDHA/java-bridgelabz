import java.util.Scanner;
public class shakehands{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	double n;
	System.out.print("enter N:");
	n = s.nextDouble();
	double max_shakes = (n*(n-1))/2;
	
	System.out.println("man num of shakes :"+ max_shakes);
	}
}

	

