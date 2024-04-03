import java.util.Scanner;

public class Q26 {
    /*
     * 3.26 (Use the &&, ||, and ^ operators) Write a program that prompts the user
     * to
     * enter an integer and determines whether it is divisible by 5 and 6, whether
     * it is
     * divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
     * Here is a
     * sample run of this program:
     * 
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        // the first line
        int x = input.nextInt();

        if (x % 5 == 0 && x % 6 == 0)
            System.out.println("Is " + x + " divisible by 5 and 6? " + true);
        else
            System.out.println("Is " + x + " divisible by 5 and 6? " + false);


        if (x % 5 == 0 || x % 6 == 0)
            System.out.println("Is " + x + " divisible by 5 or 6? " + true);
        else
            System.out.println("Is " + x + " divisible by 5 or 6? " + false);


        if ((x % 5 == 0 || x % 6 == 0) && !(x % 5 == 0 && x % 6 == 0))
            System.out.println("Is " + x + " divisible by 5 or 6, but not both?" + true);
        else
            System.out.println("Is " + x + " divisible by 5 or 6, but not both?" + false);

    }
}