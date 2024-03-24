import java.util.Scanner;
public class Q22{
	/*
*2.22 (Financial application: monetary units) Rewrite Listing 2.10,
		ComputeChange.java, to fix the possible loss of accuracy when converting
		a double value to an int value. Enter the input as an integer whose last
		two digits represent the cents. For example, the input 1156 represents 11
		dollars and 56 cents.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("how many cents do you have: ");

	
		int remainingAmount = input.nextInt();
		int tmp=remainingAmount;

		
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + tmp + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

		
	}
}