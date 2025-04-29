import java.util.Scanner;
public class multiplytable{
    public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	System.out.println(" enter a number :" );
	int n = s.nextInt();
	
	int[] table = new int[10];
	
	for (int i = 0; i < 10; i++) {
            table[i] = n * (i + 1);
        }

      
        System.out.println("\nMultiplication Table for " + n + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }
	}
}

	
	