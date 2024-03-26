import java.util.Scanner;
public class Q12{
	/*
3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit
		integer and determines whether it is a palindrome integer. An integer is palindrome
		if it reads the same from right to left and from left to right. A negative integer is
		treated the same as a positive integer. Here are sample runs of this program:
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a three-digit integer: ");

		int number3Digit = input.nextInt();
		
		int number1=number3Digit%10;
		
		int number2=number3Digit/10;
		
		number2=number2/10;
		if(number1==number2)
		{
			System.out.println(number3Digit+" is a palindrome");
			
		}
		else
		{
			System.out.println(number3Digit+" is not a palindrome");
			
		}

		
	}
}