import java.util.Scanner;
public class Q19{
	/*
*2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter
		three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
		its area. The formula for computing the area of a triangle is
		s = (side1 + side2 + side3)/2;
		area = 2s(s - side1)(s - side2)(s - side3)
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1=Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));
		double side2=Math.sqrt(Math.pow((x3-x2),2) +Math.pow((y3-y2),2));
		double side3=Math.sqrt(Math.pow((x1-x3),2) +Math.pow((y1-y3),2));
		
		double s=(side1+side2+side3)/2;
		
		double result=s*(s-side1)*(s-side2)*(s-side3);
		result=Math.sqrt(result);
		
		System.out.print("The area of the triangle is : " + result);

		
	}
}