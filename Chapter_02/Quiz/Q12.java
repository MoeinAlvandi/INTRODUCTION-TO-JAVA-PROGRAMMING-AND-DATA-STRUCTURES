import java.util.Scanner;
public class Q12{
	/*
2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
	speed v, you can compute the minimum runway length needed for an airplane to
	take off using the following formula:
	length = v2
	2a
	Write a program that prompts the user to enter v in meters/second (m/s) and
the acceleration a in meters/second squared (m/s^2)), then, displays the minimum runway length.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter v (meters/second): ");

		double v = input.nextDouble();
		
		
		System.out.print("Enter a (meters/second squared): ");

		double a = input.nextDouble();
		
		
		double result=(v*v)/(2*a);

		System.out.println("The Minimum runway length is "+result);
		
	}
}