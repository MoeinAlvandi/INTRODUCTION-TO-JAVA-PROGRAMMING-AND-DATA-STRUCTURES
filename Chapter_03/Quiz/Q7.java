import java.util.Scanner;
public class Q7{
	/*
	3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
		java, to display the nonzero denominations only, using singular words for single
		units such as 1 dollar and 1 penny, and plural words for more than one unit such
		as 2 dollars and 3 pennies.
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		if(numberOfOneDollars>0)
			if(numberOfOneDollars>1)
				System.out.println(" " + numberOfOneDollars + " dollars");
			else
				System.out.println(" " + numberOfOneDollars + " dollar");
		if(numberOfQuarters>0)
			if(numberOfQuarters>1)
				System.out.println(" " + numberOfQuarters + " quarters ");
			else
				System.out.println(" " + numberOfQuarters + " quarter ");
		if(numberOfDimes>0)
			if(numberOfDimes>1)
				System.out.println(" " + numberOfDimes + " dimes");
			else
				System.out.println(" " + numberOfDimes + " dime");
				
		if(numberOfNickels>0)
			if(numberOfNickels>1)
				System.out.println(" " + numberOfNickels + " nickels");
				
			else
				System.out.println(" " + numberOfNickels + " nickel");
				
			
		if(numberOfPennies>0)
			if(numberOfPennies>1)
				System.out.println(" " + numberOfPennies + " pennies");
				
			else
				
				System.out.println(" " + numberOfPennies + " penny");
			
	}
}