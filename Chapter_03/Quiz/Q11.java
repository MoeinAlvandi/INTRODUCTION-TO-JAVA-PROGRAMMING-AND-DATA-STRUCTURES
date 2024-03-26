import java.util.Scanner;
public class Q11{
	/*
*3.11 (Find the number of days in a month) Write a program that prompts the user
	to enter the month and year and displays the number of days in the month. For
	example, if the user entered month 2 and year 2012, the program should display
	that February 2012 has 29 days. If the user entered month 3 and year 2015, the
	program should display that March 2015 has 31 days
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter Year: ");
		int year= input.nextInt();
		
		System.out.print("Enter Month: ");
		int month= input.nextInt();
		Boolean IsKabise=false;
		int DayofMonth=0;
		if(year%4==0)
		{
			IsKabise=true;
		}
		else
		{
			IsKabise=false;
			
		}
		
		if(month==2){
			if(IsKabise)
				DayofMonth=29;
			else
				DayofMonth=28;
				
			
		}
		else if(month==1 || month==3 || month==5 || month==6 || month==7 || month==8 || month==10 || month==12)
		{
			DayofMonth=31;
			
		}else{
			DayofMonth=30;
		}

		String MonthName="";

		switch (month)
        {
            case 1 -> MonthName="January";
            case 2 -> MonthName="February";
            case 3 -> MonthName="March";
            case 4 -> MonthName="April";
            case 5 -> MonthName="May";
            case 6 -> MonthName="June";
            case 7 -> MonthName="July";
            case 8 -> MonthName="August";
            case 9 -> MonthName="September";
            case 10 -> MonthName="October";
            case 11 -> MonthName="November";
            case 12 -> MonthName="December";
        }

		System.out.println(""+MonthName+" "+year+" has "+ DayofMonth +" days.");
		
	}
}