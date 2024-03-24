import java.util.Scanner;
public class Q21{
	/*
*2.21 (Financial application: calculate future investment value) Write a program that
		reads in investment amount, annual interest rate, and number of years and displays the future investment value using the following formula:
		futureInvestmentValue =
		investmentAmount * (1 + monthlyInterestRate)
		numberOfYears*12
		For example, if you enter amount 1000, annual interest rate 3.25%, and number
		of years 1, the future investment value is 1032.98.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter investment amount: ");

		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		
		
		double annualInterestRate=input.nextDouble();
		
		
		System.out.print("Enter number of year: ");
		
		int NumberOfyear=input.nextInt();
		
		double monthlyInterestRate= 1 +(annualInterestRate/1200);
		
		double futureInvestmentValue= Math.pow(monthlyInterestRate,(NumberOfyear*12));
		futureInvestmentValue*=investmentAmount;
		
		System.out.print("Future value is : "+futureInvestmentValue);

		
	}
}