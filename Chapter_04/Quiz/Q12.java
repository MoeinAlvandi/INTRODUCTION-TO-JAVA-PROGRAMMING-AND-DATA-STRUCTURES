import java.util.Scanner;

public class Q12 {
	/*
	 * 4.12 (Hex to binary) Write a program that prompts the user to enter a hex
	 * digit and
	 * displays its corresponding binary number in four digits. For example, hex
	 * digit 7
	 * is 0111 in binary. Hex digits can be entered either in uppercase or
	 * lowercase. For
	 * an incorrect input, display invalid input. Here is a sample run:
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");
		String HexNumber = input.next();
		int Mabnaye10=0;
		if(HexNumber.length()==1){
			try{

				boolean IsCorrect=false;

				if((HexNumber.equals("A") ||
				HexNumber.equals("B")||
				HexNumber.equals("C")||
				HexNumber.equals("D")||
				HexNumber.equals("E")||
				HexNumber.equals("F")))
				{
					IsCorrect=true;
					switch (HexNumber) {
						case "A": {
							Mabnaye10 = 10;
							break;
						}
						case "B": {
							Mabnaye10 = 11;
							break;
						}case "C": {
							Mabnaye10 = 12;
							break;
						}case "D": {
							Mabnaye10 = 13;
							break;
						}case "E": {
							Mabnaye10 = 14;
							break;
						}case "F": {
							Mabnaye10 = 15;
							break;
						}
					}



				}else if((Integer.valueOf(HexNumber)>0 && Integer.valueOf(HexNumber)<10)){
					IsCorrect=true;
					Mabnaye10=Integer.valueOf(HexNumber);
	
				}else{
					System.out.println(HexNumber + " is an invalid input");
	
				}

				if(IsCorrect){
					
					int reminder=Mabnaye10;
					int result=Mabnaye10;
					String Dodoyee="";
					while (result>0) {
						reminder=result%2;
						result=result/2;
						Dodoyee=reminder+Dodoyee;
					}

					System.out.println("The binary value is "+ Dodoyee);
				}
				else{

					System.out.println(HexNumber + " is an invalid input");
				}

			}catch(Exception ex){
				System.out.println(HexNumber + " is an invalid input");

			}


			
		}
		else
		{
			System.out.println(HexNumber + " is an invalid input");
		}
	}
}