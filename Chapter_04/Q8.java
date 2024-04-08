import java.util.Scanner;
public class Q8{
	/*
	*3.8 (Sort three integers) Write a program that prompts the user to enter three integers
		and display the integers in non-decreasing order.
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Three Number: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("------order List------");
		
		if(a < b && a < c)
		{
			System.out.println(a);
			if(b<c){
				System.out.println(b);
				System.out.println(c);
				
			}
			else
			{
				System.out.println(c);
				System.out.println(b);
				
			}
		}else if(b<a && b<c){
			System.out.println(b);
			if(a<c){
				System.out.println(a);
				System.out.println(c);
				
			}
			else
			{
				System.out.println(c);
				System.out.println(a);
				
			}
		}else if(c<a && c<b)
		{
			System.out.println(c);
			if(a<b){
				System.out.println(a);
				System.out.println(b);
				
			}
			else
			{
				System.out.println(b);
				System.out.println(a);
				
			}
		}
		
	}
}