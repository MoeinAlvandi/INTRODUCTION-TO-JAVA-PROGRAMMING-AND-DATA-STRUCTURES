import java.util.Scanner;
public class Q1{
	/*
	*3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation
		ax2 + bx + c = 0 can be obtained using the following formula:
		r1 = -b + 2b2 - 4ac
		2a
		and r2 = -b - 2b2 - 4ac
		2a
		b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
		equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
		Write a program that prompts the user to enter values for a, b, and c and displays
		the result based on the discriminant. If the discriminant is positive, display two
		roots. If the discriminant is 0, display one root. Otherwise, display “The equation
		has no real roots.”
		Note you can use Math.pow(x, 0.5) to compute 2x.
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a,b and c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant=Math.pow(b,2)-(4*a*c);
		
		if(discriminant>0)
		{
			//tow root
			double r1=(-b + Math.sqrt(discriminant))/(2*a);
			double r2=(-b - Math.sqrt(discriminant))/(2*a);
			System.out.print("The equation has two roots "+ r1 +" and "+r2);
			
			
		}else if(discriminant==0){
			//one root
			double r1=(-b + Math.sqrt(discriminant))/(2*a);
			System.out.print("The equation has one root "+ r1);
		}else{
			System.out.print("The equation has no real roots.");
			
		}
		
		
		
	}
}