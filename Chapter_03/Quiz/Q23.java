import java.util.Scanner;

public class Q23 {
	/*
	 * Scanner input = new Scanner(System.in);
	 * 
	 * System.out.print("Enter a point with two coordinates: ");
	 * int width=10;
	 * int height=5;
	 * int x = input.nextInt();
	 * int y = input.nextInt();
	 * 
	 * //double result = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
	 * if ((x <= width/2) && (y<=height/2)) {
	 * System.out.println("Point (" + x + " , " + y + ") is in the circle");
	 * } else {
	 * System.out.println("Point (" + x + " , " + y + ") is not in the circle");
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		int width = 10;
		int height = 5;
		double x = input.nextDouble();
		double y = input.nextDouble();
		x=Math.abs(x);
		y=Math.abs(y);
		// double result = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
		if ((x <= width / 2) && (y <= height / 2)) {
			System.out.println("Point (" + x + " , " + y + ") is in the circle");
		} else {
			System.out.println("Point (" + x + " , " + y + ") is not in the circle");

		}

	}
}