import java.util.Scanner;

public class Q24 {
	/*
	 ** 3.24 (Game: pick a card) Write a program that simulates picking a card from a
	 * deck
	 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8,
	 * 9, 10,
	 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
	 * Here is a sample run of the program:
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number From 1 to 52: ");
		int n = input.nextInt();

		if (n > 1 && n <= 13) {
			// Clubs

			String cartName = "";
			if (n == 1) {
				cartName = "Ace";
			} else if (n > 1 && n <= 10) {
				cartName = n + "";
			} else if (n == 11) {
				cartName = "Jack";
			} else if (n == 12) {
				cartName = "Queen";
			} else if (n == 13) {
				cartName = "King";
			}
			System.out.println("The card you picked is " + cartName + " of Clubs");

		} else if (n > 13 && n <= (13 * 2)) {
			// Diamonds

			String cartName = "";
			n = n - 13;
			if (n == 1) {
				cartName = "Ace";
			} else if (n > 1 && n <= 10) {
				cartName = n + "";
			} else if (n == 11) {
				cartName = "Jack";
			} else if (n == 12) {
				cartName = "Queen";
			} else if (n == 13) {
				cartName = "King";
			}
			System.out.println("The card you picked is " + cartName + " of Diamonds");
		} else if (n > (13 * 2) && n <= (13 * 3)) {
			// Hearts
			String cartName = "";
			n = n - (13 * 2);
			if (n == 1) {
				cartName = "Ace";
			} else if (n > 1 && n <= 10) {
				cartName = n + "";
			} else if (n == 11) {
				cartName = "Jack";
			} else if (n == 12) {
				cartName = "Queen";
			} else if (n == 13) {
				cartName = "King";
			}
			System.out.println("The card you picked is " + cartName + " of Hearts");
		} else if (n > (13 * 3) && n <= (13 * 4)) {
			// Spades
			String cartName = "";
			n = n - (n * 13);
			if (n == 1) {
				cartName = "Ace";
			} else if (n > 1 && n <= 10) {
				cartName = n + "";
			} else if (n == 11) {
				cartName = "Jack";
			} else if (n == 12) {
				cartName = "Queen";
			} else if (n == 13) {
				cartName = "King";
			}
			System.out.println("The card you picked is " + cartName + " of Spades");
		}

	}
}