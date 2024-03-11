import java.util.Scanner;
public class Q5{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		 double TotalGratuity = subtotal * (gratuity / 100);
		 double Total = subtotal + TotalGratuity;+
		 
		 System.out.println("The gratuity is $" + TotalGratuity + " and total is $" + Total );
		
	}
}