import java.util.Scanner;

public class Q11 {
	/*
	 * (Decimal to hex) Write a program that prompts the user to enter an integer
	 * between 0 and 15 and displays its corresponding hex
	 * number. For an incorrect
	 * input number, display invalid input. Here are some sample runs:
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int number = input.nextInt();

		if (number >= 0 && number <= 10) {
			System.out.println("The hex value is " + number);
		} else if (number >= 11 && number <= 15) {
			String CharHex = "";
			switch (number) {
				case 10: {
					CharHex = "A";
					break;
				}
				case 11: {
					CharHex = "B";
					break;
				}case 12: {
					CharHex = "C";
					break;
				}case 13: {
					CharHex = "D";
					break;
				}case 14: {
					CharHex = "E";
					break;
				}case 15: {
					CharHex = "F";
					break;
				}
			}
			System.out.println("The hex value is "+CharHex);

		} else {
			System.out.println(number + " is an invalid input");
		}

	}
}