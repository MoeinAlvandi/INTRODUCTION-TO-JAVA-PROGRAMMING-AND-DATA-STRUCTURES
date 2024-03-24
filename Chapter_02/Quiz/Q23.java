import java.util.Scanner;
public class Q23{
	/*
*2.22 (Financial application: monetary units) Rewrite Listing 2.10,
		ComputeChange.java, to fix the possible loss of accuracy when converting
		a double value to an int value. Enter the input as an integer whose last
		two digits represent the cents. For example, the input 1156 represents 11
		dollars and 56 cents.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the driving distance: ");

		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");

		double miles_per_gallon = input.nextDouble();
		
		System.out.print("Enter c per gallon: ");

		double price_per_gallon = input.nextDouble();
		double result=distance/miles_per_gallon;
		
		result*=price_per_gallon;
		
		System.out.print("The cost of driving is $"+ result);
		
		
	}
}