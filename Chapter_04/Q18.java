import java.util.Scanner;

public class Q18 {
	/*
	 * (Cost of shipping) A shipping company uses the following function to
	 * calculate
	 * the cost (in dollars) of shipping based on the weight of the package (in
	 * pounds).
	 * c(w) = d
	 * 3.5, if 0 6 w 6 = 1
	 * 5.5, if 1 6 w 6 = 3
	 * 8.5, if 3 6 w 6 = 10
	 * 10.5, if 10 6 w 6 = 20
	 * Write a program that prompts the user to enter the weight of the package and
	 * displays the shipping cost. If the weight is negative or zero, display a
	 * message
	 * “Invalid input.” If the weight is greater than 20, display a message “The
	 * package
	 * cannot be shipped.”
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight  of The Package(In Pound): ");
		int Weight = input.nextInt();

		if (Weight > 0) {
			if (Weight <= 20) {
				if(Weight>0 && Weight<=1)
				{
					System.out.println("Your Cost Is: " + 3.5+ " dolar.");
				}
				else if(Weight>1 && Weight<=3)
				{
					System.out.println("Your Cost Is: " + 5.5+ " dolar.");

				}
				else if(Weight>3 && Weight<=10)
				{
					System.out.println("Your Cost Is: " + 8.5+ " dolar.");

				}
				else if(Weight>10 && Weight<=20)
				{
					System.out.println("Your Cost Is: " + 10.5+ " dolar.");

				}
			} else {
				System.out.println("The packagen cannot be shipped.");

			}
		} else {
			System.out.println("Invalid input.");
		}

	}
}