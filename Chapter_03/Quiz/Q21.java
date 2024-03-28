import java.util.Scanner;

public class Q21 {
	/*
	 ** 3.21 (Science: day of the week) Zeller’s congruence is an algorithm developed
	 * by
	 * Christian Zeller to calculate the day of the week. The formula is
	 * h = aq +
	 * 26(m + 1)
	 * 10
	 * + k +
	 * k
	 * 4
	 * + j
	 * 4
	 * + 5jb,7
	 * where
	 * ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
	 * Wednesday, 5: Thursday, and 6: Friday).
	 * ■ q is the day of the month.
	 * ■ m is the month (3: March, 4: April, ..., 12: December). January and
	 * February
	 * are counted as months 13 and 14 of the previous year.
	 * ■ j is year
	 * 100
	 * .
	 * ■ k is the year of the century (i.e., year % 100).
	 * Note all divisions in this exercise perform an integer division. Write a
	 * program
	 * that prompts the user to enter a year, month, and day of the month, and
	 * displays
	 * the name of the day of the week. Here are some sample runs:
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");

		int year = input.nextInt();

		System.out.print("Enter month: 1-12: ");

		int month = input.nextInt();

		System.out.print("Enter the day of the month: 1-31: ");

		int day = input.nextInt();

		if (month < 3) {
			month += 12;
			year--;
		}

		int q = day;
		int m = month;
		int j = year / 100;
		int k = year % 100;

		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		switch (h) {
			case 0:
				System.out.println("Day of the week is Saturday");
				break;
			case 1:
				System.out.println("Day of the week is Sunday");
				break;
			case 2:
				System.out.println("Day of the week is Monday");
				break;
			case 3:
				System.out.println("Day of the week is Tuesday");
				break;
			case 4:
				System.out.println("Day of the week is Wensday");
				break;
			case 5:
				System.out.println("Day of the week is Thursday");
				break;
			case 6:
				System.out.println("Day of the week is Friday");
				break;

		}

	}
}