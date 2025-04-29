import java.util.Scanner;
public class sumofelements{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println(" enter numbers :");
	int sum = 0;
	int[] num = new int[10];
	
	for(int i = 0;i<num.length;i++){
	System.out.println(" number " +i +":");	
    num[i] = s.nextInt();
	
    sum = sum + num[i];
	
	System.out.println(" sum of elements is : "+ sum);}
	}

}
