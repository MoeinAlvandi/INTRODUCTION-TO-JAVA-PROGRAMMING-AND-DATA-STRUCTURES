import java.util.Scanner;
public class Q15{
	/*
2.15 (Geometry: distance of two points) Write a program that prompts the user to
		enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the distance is 2(x2 - x1)
		2 + (y2 - y1)
		2
		. Note you can use
		Math.pow(a, 0.5) to compute 2a. Here is a sample run:
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter x1 and y1: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double tmp=0;
		double result=0;
		tmp=(x2-x1);
		tmp=tmp*tmp;
		
		result=tmp;
		
		tmp=(y2-y1);
		tmp=tmp*tmp;
		
		result=result+tmp;
		
		result=Math.pow(result, 0.5); 
		
		System.out.print("The distance between the two points is : " + result);

		
	}
}