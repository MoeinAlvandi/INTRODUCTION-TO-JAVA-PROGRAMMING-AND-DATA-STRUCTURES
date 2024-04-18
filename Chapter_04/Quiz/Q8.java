import java.util.Scanner;

public class Q8 {
	/*
	 * 4.8 (Find the character of an ASCII code) Write a program that receives an
	 * ASCII code
	 * (an integer between 0 and 127) and displays its character. Here is a sample
	 * run:
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code(0 to 127): ");
		int a = input.nextInt();
		if(a>=0 && a<=127){
			System.out.println("The ASCII code for character "+ a + " is " + (char) (a));
		}else
		{
			System.out.println("Your Number is Wrong.");
		}

	}
}