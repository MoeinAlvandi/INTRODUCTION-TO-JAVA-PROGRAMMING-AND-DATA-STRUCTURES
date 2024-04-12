import java.util.Scanner;

public class Q5 {
	/*
	 * 4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided
	 * polygon
	 * in which all sides are of the same length and all angles have the same degree
	 * (i.e.,
	 * the polygon is both equilateral and equiangular). The formula for computing
	 * the
	 * area of a regular polygon is
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int n=input.nextInt();
		System.out.print("Enter the side:");
		double s=input.nextDouble();

        double area=n*(Math.pow(s, 2));
        area=area/(4*(Math.tan(Math.PI/n)));
        System.out.println("The area of the polygon is "+area);

	}
}