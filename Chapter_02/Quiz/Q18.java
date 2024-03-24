import java.util.Scanner;
public class Q18{
	/*
2.18 (Print a table) Write a program that displays the following table. Cast
		floating-point numbers into integers.
		a b pow(a, b)
		1 2 1
		2 3 8
		3 4 81
		4 5 1024
		5 6 15625
*/
	
	
	public static void main(String[] args){
		
		System.out.print("a b a^b");
		
		
		for(int i=1;i<=5;i++)
		{
			int tmp=(int) Math.round(Math.pow(i,i+1));
			System.out.print(i + " " + (i+1) + " " + tmp);
			System.out.println();
			
		}
		
		


		
	}
}