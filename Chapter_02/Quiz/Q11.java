import java.util.Scanner;
public class Q11{
	/*
	2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. Here is a sample
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Number of Years: ");

		int NumberOfYear = input.nextInt();
		
		int AllSecound = 365 * 24 * 60 * 60;

		int births = (AllSecound / 7) * NumberOfYear;
		int deaths = (AllSecound / 13) * NumberOfYear;
		int immigrant = (AllSecound / 45) * NumberOfYear;
		int Allpopulation = (births + immigrant + 312032486) - deaths;
		System.out.println("population in "+NumberOfYear+" years later is => "+ Allpopulation);
		
	}
}