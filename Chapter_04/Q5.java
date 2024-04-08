import java.util.Scanner;
public class Q5{
	/*
	*3.5 (Find future dates) Write a program that prompts the user to enter an integer for
		today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
		prompt the user to enter the number of days after today for a future day and display the future day of the week.
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();	

		System.out.print("Enter the number of days elapsed since today: ");
		int days_elapsed = input.nextInt();
		days_elapsed=days_elapsed+today;
		if(days_elapsed>6){
			days_elapsed=days_elapsed%7;
		}
		
		String todayCapt="";
		String FutureCapt="";
		
		switch(today)
		{
            case 0 :{
				todayCapt="Sunday";
				break;
			}
			case 1:{
				todayCapt="Monday";
				break;
				
			}
            case 2 :
			{
				todayCapt="Tuesday";
				break;
			}
            case 3:
			{
				todayCapt="Wednesday";
				break;
			}
            case 4 :
			{
				todayCapt="Thursday";
				break;
			
			}
            case 5:
			{
				todayCapt="Friday";
				break;
			
			}
            case 6:
			{
				todayCapt="Saturday";
				break;
			
			}
		}
		switch(days_elapsed)
		{
            case 0 :{
				FutureCapt="Sunday";
				break;
			}
			case 1:{
				FutureCapt="Monday";
				break;
				
			}
            case 2 :
			{
				FutureCapt="Tuesday";
				break;
			}
            case 3:
			{
				FutureCapt="Wednesday";
				break;
			}
            case 4 :
			{
				FutureCapt="Thursday";
				break;
			
			}
            case 5:
			{
				FutureCapt="Friday";
				break;
			
			}
            case 6:
			{
				FutureCapt="Saturday";
				break;
			
			}
		}
		
		 System.out.println("Today is " + todayCapt + "  and the future day is " + FutureCapt );
		 
		
	}
}