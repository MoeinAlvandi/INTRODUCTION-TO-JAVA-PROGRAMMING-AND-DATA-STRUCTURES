import java.util.Scanner;
import java.util.Random;

public class Q16{
	/*
3.16 (Random point) Write a program that displays a random coordinate in a rectangle. 
		The rectangle is centered at (0, 0) with width 100 and height 200.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		Random random = new Random();

		int x = random.nextInt(101);
		int y = random.nextInt(201);

		System.out.print("The point Cordinate is (x,y): (" + x + "," +y+")");

		
	}
}