import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    int[] temp = new int[maxFactor * 2];
                    for (int j = 0; j < maxFactor; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                    maxFactor *= 2;
                }
                factors[index++] = i;
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
        scanner.close();
    }
}
