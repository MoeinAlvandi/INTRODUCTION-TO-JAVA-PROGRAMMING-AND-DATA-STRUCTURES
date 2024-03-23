import java.util.Scanner;
public class Q6{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a number between 0 and 1000: ");

		int number =input.nextInt();
		
		if(number>0 && number<1000)
		{
			int number3=number %10;//9
			int number2=0;
			int number1=0;
			
			if((number /10)>0)//93
			{
				number = number/10;//9
				number2=number %10;//3
				
				if((number/10)>0)
				{
					
					number=number/10;
					
					number1=number%10;
					
				}
				
			}
			int result=number1+number2+number3;
		System.out.print("The sum of the digits is " + result);
			
		}
		else
		{
		System.out.print("Your Numbe Is Not Between 0 And 1000");
			
		}
	}
}