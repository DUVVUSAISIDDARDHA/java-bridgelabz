import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddIndex = 0;
        int evenIndex = 0;
        
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }
        }
        s.close();
    }
}


	
	