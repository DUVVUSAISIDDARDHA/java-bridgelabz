import java.util.Scanner;
public class vote{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int age;
	System.out.print("enter age:");
	age = s.nextInt();
	
	if(age >= 18){
	System.out.println("can vote");}
	else{
	System.out.println("cannot vote");}
	}
}
