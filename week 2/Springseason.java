import java.util.Scanner;
public class Springseason{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	String month;
	int day;
	System.out.print("enter month:");
	month = s.next();
	System.out.print("enter day :");
	day = s.nextInt();
	
	if(month.equalsIgnoreCase("march") && day >= 20 || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("june") && day <=20) {
	System.out.println(" SpringSeason");}
	else{
	System.out.println(" not a SpringSeason");}
	}
}
	