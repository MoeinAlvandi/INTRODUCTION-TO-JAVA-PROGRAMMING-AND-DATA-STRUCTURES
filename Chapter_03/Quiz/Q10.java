import java.util.Scanner;
public class Q10{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the amount of water in kilograms: ");

		double m = input.nextDouble();
		
		System.out.print("Enter the initial temperature : ");

		double it = input.nextDouble();		
		
		System.out.print("Enter the final temperature: ");

		double ft = input.nextDouble();
		
		
		double result=ft-it;
		result=result*4184;
		result=result*m;
		
		System.out.print("The energy needed is " + result);
		
	}
}