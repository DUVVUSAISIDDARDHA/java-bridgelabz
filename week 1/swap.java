import java.util.Scanner;
public class swap{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	int a;
	int b;
	System.out.print("enter a :");
	a = s.nextInt();
	System.out.print(" enter b : ");
	b = s.nextInt();
	
	int temp = a;
	a= b;
	b = temp;
	
	System.out.println("The swapped numbers are :" + "a is "+ a +" b is "    + b);
	}
}

    
	