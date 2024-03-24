import java.util.Scanner;
public class Q3{
	/*
	*3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
		Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
		the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
		that “The equation has no solution.”
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
		double b = input.nextDouble();
		
        double c = input.nextDouble();
		double d = input.nextDouble();
				
        double e = input.nextDouble();
		double f = input.nextDouble();
		double check=(a*d)-(b*c);
		if(check==0)
		{
			System.out.print("The equation has no solution.");
		}
		else
		{
			double determinantOfX = (c * e) - (b * f),
                    determinantOfY = (a * f) - (d * c),
                    determinant = (a * e) - (b * d);
					
			double X = determinantOfX / determinant,
                   Y = determinantOfY / determinant;
				   
		 System.out.println("x is " + Math.round(X) + " and y is " + Math.round(Y));
				   
		}
		
		
		
	}
}