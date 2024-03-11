import java.util.Scanner;
public class Q7{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the number of minutes: ");

		long minutes = input.nextLong();
		
		int days = (int) ((minutes / 60) / 24);
		
		int years = days / 365;
		
		int remainingDays = days % 365;
		System.out.println(minutes + " minutes is approximately " + years + " years and "+ remainingDays + " days");
		
	}
}