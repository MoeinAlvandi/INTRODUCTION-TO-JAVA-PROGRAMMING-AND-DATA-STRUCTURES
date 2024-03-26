import java.util.Scanner;

public class Q14 {
	/*
	 * 3.14 (Game: heads or tails) Write a program that lets the user guess whether
	 * the flip
	 * of a coin results in heads or tails. The program randomly generates an
	 * integer
	 * 0 or 1, which represents head or tail. The program prompts the user to enter
	 * a
	 * guess, and reports whether the guess is correct or incorrect.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number 0=> heads or 1=>tails: ");
		int usercoin = input.nextInt();

		int rndcoin = (int) Math.round(Math.random());
		String Caption="";
		if(rndcoin==1)
		Caption="head";
		else
		Caption="tail";


		if (rndcoin == usercoin)
			System.out.print("You are Winner!");
		else
			System.out.print("You are loser! the coin was "+Caption );

	}
}