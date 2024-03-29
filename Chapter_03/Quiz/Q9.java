import java.util.Scanner;
public class Q9{
	/*
	**3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
		consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
		which is calculated from the other 9 digits using the following formula:
		(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
			d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
		If the checksum is 10, the last digit is denoted as X according to the ISBN-10
		convention. Write a program that prompts the user to enter the first 9 digits and
		displays the 10-digit ISBN (including leading zeros). Your program should read
		the input as an integer. Here are sample runs:
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");

		int number = input.nextInt();
		int remining=number;
		int result=number;
		int a=0;
		int b=10;
		int summ=0;
		while(result>0)
		{
			a++;
			b--;
			remining=result%10;
			result=result/10;
			summ+=(remining*b);
			//System.out.println("number "+ a +": " + (remining*b));
		}
		
		summ=summ%11;
		System.out.println(summ);
		 if (summ == 10)
            System.out.println("The ISBN-10 number is 0" + number + "X");
        else
            System.out.println("The ISBN-10 number is 0" + number + "" + summ);
		
		
	}
}