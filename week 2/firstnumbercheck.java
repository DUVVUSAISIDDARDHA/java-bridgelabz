import java.util.Scanner;
public class firstnumbercheck{
    public static void main(String[] args){
	
	Scanner a = new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	System.out.print("enter num1:");
	num1 = a.nextInt();
	System.out.print("enter num2:");
	num2 = a.nextInt();
	System.out.print("enter num3:");
	num3 = a.nextInt();
	
	if (num1>num2 && num1>num3){
	System.out.println("num1 is not smallest");}
    else {
	System.out.println("num1 is smallest");	}
	}
}

	
	
	