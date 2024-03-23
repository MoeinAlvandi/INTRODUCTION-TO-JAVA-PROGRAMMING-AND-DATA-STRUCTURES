import java.util.Scanner;
public class Q2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double area=radius * radius * PI;
		
		
		double volume=area * length;
		
		System.out.print("The area is "+ area);
		System.out.print("The volume is "+ volume);
		
		
	}
}