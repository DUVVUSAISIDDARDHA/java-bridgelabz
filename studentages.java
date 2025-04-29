import java.util.Scanner;
public class studentages{
    public static void main(String[] args){
	
	int studentages[] = new int[10];
	Scanner s = new Scanner(System.in);
	System.out.println("enter student ages");
	for( int i=0;i<studentages.length;i++){
	System.out.println("student " + (i+1) + "age :");
	studentages[i] = s.nextInt();}
	
	for( int i=0;i<studentages.length;i++){
	int age = studentages[i];
	
	if(age > 18){
	System.out.println(" can vote");}
	else{
	System.out.println(" cannot vote");}}
	}
}

	
	
	
	
	
	
	
	