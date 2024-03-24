import java.util.Scanner;
public class Q16{
	/*
2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
		side of a hexagon and displays its area. The formula for computing the area of a
		hexagon is
		Area = 323
		2
		s
		2
		,
		where s is the length of a side. Here is a sample run:
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the length of the side: ");

		double s = input.nextDouble();
		
		double result=0;
		result=Math.pow(3,0.5);
		result*=3;
		
		result/=2;
		
		result*=(Math.pow(s,2));
		
		System.out.print("The area of the hexagon is : " + result);

		
	}
}