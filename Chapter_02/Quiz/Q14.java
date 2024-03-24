import java.util.Scanner;
public class Q14{
	/*
*2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
		health on weight. It can be calculated by taking your weight in kilograms and dividing, 
		by the square of your height in meters. Write a program that prompts the user to
		enter a weight in pounds and height in inches and displays the BMI. Note one pound
		is 0.45359237 kilograms and one inch is 0.0254 meters.
*/
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter weight in pounds: ");

		double weight = input.nextDouble();
		weight=(weight*0.45359237);//Convert to kilograms

		System.out.print("Enter height in inches: ");

		double height = input.nextDouble();
		height=(height* 0.0254);//Convert To meters
		
		double result=weight/(height*height);
		
		
		System.out.print("BMI is : "+result);

		
	}
}