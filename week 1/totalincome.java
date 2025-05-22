import java.util.Scanner;
public class totalincome{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	int salary;
	int bonus;
	System.out.print("enter salary");
	salary = s.nextInt();
	System.out.print("enter bonus ");
	bonus = s.nextInt();
	
	int totalincome= salary+bonus;
	
	System.out.println("totalincome is :" + totalincome);
	}
}

	
	