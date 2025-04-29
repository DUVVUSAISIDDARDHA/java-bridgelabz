import java.util.Scanner;
public class mean{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print(" heights of players are :");
	double[] height = new double[11];
	double sum=0;
	for(int i=0;i<height.length;i++){
	System.out.print("player " + (i+1) + "height");
	height[i] = s.nextDouble();}
	
	for(int i=0;i<height.length;i++){
	sum = sum + height[i];}
	
	
	System.out.println(" mean height is :" + sum/11);
	
	}
}

	
	
	
	
	