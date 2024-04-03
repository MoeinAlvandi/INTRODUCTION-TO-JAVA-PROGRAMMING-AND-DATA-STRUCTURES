import java.util.Scanner;

public class Q29 {
    /*
     ** 3.29 (Geometry: two circles) Write a program that prompts the user to enter
     * the center
     * coordinates and radii of two circles and determines whether the second circle
     * is inside the first or overlaps with the first, as shown in Figure 3.10.
     * (Hint: circle2 is inside circle1 if the distance between the two centers 6 =
     * r1 − r2
     * and circle2 overlaps circle1 if the distance between the two centers 6 =
     * r1 + r2. Test your program to cover all cases.)
     * Here are the sample runs:
     * 
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1radius = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2radius = input.nextDouble();

        double distancesSum = Math.pow(Math.pow(r2x - r1x, 2) + Math.pow(r2y - r1y, 2), 0.5);

        if (distancesSum <= Math.abs(r1radius - r2radius))
            System.out.println("circle2 is inside circle1");

        else if (distancesSum <= r1radius + r2radius)
            System.out.println("circle2 overlaps circle1");

        else
            System.out.println("circle2 does not overlap circle1");
    }
}