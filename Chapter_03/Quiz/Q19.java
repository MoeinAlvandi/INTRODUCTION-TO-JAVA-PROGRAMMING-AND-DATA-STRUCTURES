import java.util.Scanner;

public class Q19 {
	/*
	 ** 3.19 (Compute the perimeter of a triangle) Write a program that reads three
	 * edges for
	 * a triangle and computes the perimeter if the input is valid. Otherwise,
	 * display
	 * that the input is invalid. The input is valid if the sum of every pair of two
	 * edges is
	 * greater than the remaining edge.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 Edge of triangle: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > 0 && b > 0 && c > 0) {
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				int result = a + b + c;
				System.out.print("The perimeter of the triangle is : " + result);

			} else {
				System.out.println("input is invalid");
1
			}
		} else {
			System.out.println("input is invalid");
		}

	}
}