import java.util.Scanner;
import java.util.Random;

public class Q15 {
	/*
	 ** 3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery
	 * of a threedigit integer. The program prompts the user to enter a three-digit
	 * integer and
	 * determines whether the user wins according to the following rules:
	 * 1. If the user input matches the lottery number in the exact order, the award
	 * is
	 * $10,000.
	 * 2. If all digits in the user input match all digits in the lottery number,
	 * the award
	 * is $3,000.
	 * 3. If one digit in the user input matches a digit in the lottery number, the
	 * award
	 * is $1,000.
	 */

	public static void main(String[] args) {

		// Generate a lottery number
		Random random = new Random();
		int lottery = random.nextInt(900) + 100;

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();

		// Get digits from lottery

		int number1lottery = lottery % 10;// 245 10 24 5

		int number2lottery = lottery / 10;// 24
		int number3lottery = number2lottery / 10;// 24 2
		number2lottery = number2lottery % 10;// 24 4

		// Get digits from guess
		int number1guess = guess % 10;// 245 10 24 5
		int number2guess = guess / 10;// 24
		int number3guess = number2guess / 10;// 24 2
		number2guess = number2guess % 10;// 24 4

		System.out.println("The lottery number is " + lottery);

		if (lottery == guess) {
			System.out.println("Exact match: you win $10,000");
		} else if ((number1lottery == number1guess || number1lottery == number2guess || number1lottery == number3guess)
				&&
				(number2lottery == number1guess || number2lottery == number2guess || number2lottery == number3guess) &&
				(number3lottery == number1guess || number3lottery == number2guess || number3lottery == number3guess)) {
			System.out.println("Match all digits: you win $3,000");

		} else if ((number1lottery == number1guess || number1lottery == number2guess || number1lottery == number3guess)
				||
				(number2lottery == number1guess || number2lottery == number2guess || number2lottery == number3guess) ||
				(number3lottery == number1guess || number3lottery == number2guess || number3lottery == number3guess))
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");

	}
}