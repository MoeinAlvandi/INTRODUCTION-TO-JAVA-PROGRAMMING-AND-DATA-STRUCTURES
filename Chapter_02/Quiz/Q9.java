import java.util.Scanner;
public class Q9{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter v0, v1, and t: ");

		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double result=v1-v0;
		result=result/t;
		
		System.out.print("The average acceleration is " + result);
		
	}
}