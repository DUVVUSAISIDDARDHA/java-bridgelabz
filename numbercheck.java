import java.util.Scanner;
public class numbercheck{
    public static void main(String[] args){
	int number[] = new int[5];
	Scanner s = new Scanner(System.in);
	System.out.println(" the numbers are"); 
	
	for(int i=0;i<number.length;i++){
	System.out.println(" number " + (i+1) ) ;
	number[i] = s.nextInt();}
	
	System.out.println(" checking the condition " );
	
	for(int i=0;i<number.length;i++){
	int num = number[i];
	
	if(num>0){
	System.out.println(" number is positive " );
	    if(num%2 == 0){
		System.out.println(" number is even" );}
		else{
		System.out.println(" number is odd " );}}

	else if(num<0){
	System.out.println(" number is negitive " );}
	
	else{
	System.out.println(" number is zero " );}}
	
	int firstelement = number[0];
	int lastelement = number[number.length-1];
	
	if(firstelement>lastelement){
	System.out.println(" first is largest " );}
	else if(firstelement==lastelement){
	System.out.println(" numbers are equal " );}
	else{
	System.out.println(" first is smallest " );	}
	
	}
}
	
	
	
	
	
	
    
    
	
	
