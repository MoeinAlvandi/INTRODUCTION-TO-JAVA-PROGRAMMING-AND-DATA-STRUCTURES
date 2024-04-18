import java.util.Scanner;
public class Q9{
	/*
*4.9 (Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code(0 to 127): ");
		String a = input.next();
		if(a.length()==1){
			System.out.println("The ASCII code for character "+ a + " is " + (int) (a.charAt(0)));
		}else
		{
			System.out.println("Your Input is Wrong.The input Must be one Character");
		}
		
		
	}
}