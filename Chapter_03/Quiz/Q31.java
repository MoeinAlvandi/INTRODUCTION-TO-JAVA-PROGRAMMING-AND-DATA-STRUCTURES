import java.util.Scanner;

public class Q31 {
    /*
     * 3.31 (Financials: currency exchange) Write a program that prompts the user to
     * enter
     * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
     * user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
     * from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
     * dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars,
     * respectively. Here are the sample runs:
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchange_rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int kind = input.nextInt();

        if (kind == 0) {
            System.out.println("Enter the dollar amount: ");
            double amount = input.nextDouble();
            double result = exchange_rate * amount;
            System.out.print("$" + amount + " is " + result + " yuan");
        } else if (kind == 1) {
            System.out.print("Enter the RMB amount: ");
            double amount = input.nextDouble();
            double result = amount/exchange_rate;
            System.out.println( amount + " yuan is $" + result );

        }else
        System.out.println("InCorrect choses.");
    }
}