import java.util.Random;
import java.util.Scanner;

public class Q17 {
	/*
	 * 3.17 (Game: scissor, rock, paper) Write a program that plays the popular
	 * scissor–
	 * rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
	 * a paper can wrap a rock.) The program randomly generates a number 0, 1, or
	 * 2 representing scissor, rock, and paper. The program prompts the You to
	 * enter
	 * a number 0, 1, or 2 and displays a message indicating whether the You or the
	 * computer wins, loses, or draws. Here are sample runs:
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int botguess = random.nextInt(3);

		String botguessCaption = "";
		String guessCaption = "";
		if (botguess == 0)
			botguessCaption = "scissor";
		else if (botguess == 1)
			botguessCaption = "rock";
		else if (botguess == 2)
			botguessCaption = "paper";

		System.out.print("scissor (0), rock (1), paper (2): ");

		int guess = input.nextInt();
		if (guess == 0)
			guessCaption = "scissor";
		else if (guess == 1)
			guessCaption = "rock";
		else if (guess == 2)
			guessCaption = "paper";

		if (botguess != guess) {
			if (botguess == 0) {
				if (guess == 2) {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"System Win");
				} else {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"You Win");

				}
			} else if (botguess == 1) {
				if (guess == 2) {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"You Win");
				} else {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"System Win");

				}
			} else if (botguess == 2) {
				if (guess == 0) {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"You Win");
				} else {
					System.out.println("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"System Win");

				}
			}
		} else
			System.out.print("The computer is "+botguessCaption+".  You are "+guessCaption+"."+"It is a draw");

	}
}