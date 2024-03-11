import java.util.Scanner;
public class FahrenheitToCelsius{
	
	public static void main(String[] args){
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);

		int remainingSeconds = seconds % 60;
		System.out.println("Fahrenheit " + fahrenheit + " is " +celsius + " in Celsius");

	}
}