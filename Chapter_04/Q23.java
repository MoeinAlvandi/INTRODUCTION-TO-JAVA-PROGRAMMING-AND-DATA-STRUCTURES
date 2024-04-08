import java.util.Scanner;

public class Q23 {
	/*
	 ** 3.23 (Geometry: point in a rectangle?) Write a program that prompts the user
	 * to enter
	 * a point (x, y) and checks whether the point is within the rectangle centered
	 * at
	 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the
	 * rectangle and
	 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is
	 * in the
	 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 /
	 * 2 and its
	 * vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your
	 * program to
	 * cover all cases.) Here are two sample runs:
	 * 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double width = 10.0;
		double height = 5.0;
		double x = input.nextDouble();
		double y = input.nextDouble();

		// double result = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
		if (x < 0)
			width = width * -1;
		if (y < 0)
			height = height * -1;
		width = Math.abs(width);
		height = Math.abs(height);
		x = Math.abs(x);
		y = Math.abs(y);

		if ((x <= width / 2) && (y <= height / 2)) {
			System.out.println("Point (" + x + " , " + y + ") is in the circle");
		} else {
			System.out.println("Point (" + x + " , " + y + ") is not in the circle");

		}

	}
}