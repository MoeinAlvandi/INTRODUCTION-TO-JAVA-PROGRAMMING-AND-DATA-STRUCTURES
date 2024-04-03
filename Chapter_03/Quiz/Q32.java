import java.util.Scanner;

public class Q32 {
    /*
     * 3.32 (Geometry: point position) Given a directed line from point p0(x0, y0)
     * to p1(x1,
     * y1), you can use the following condition to decide whether a point p2(x2, y2)
     * is
     * on the left of the line, on the right, or on the same line (see Figure 3.11):
     * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) c
     * 70 p2 is on the left side of the line
     * =0 p2 is on the same line
     * 60 p2 is on the right side of the line
     * Write a program that prompts the user to enter the three points for p0, p1,
     * and p2
     * and displays whether p2 is on the left of the line from p0 to p1, to the
     * right, or on
     * the same line. Here are some sample runs:
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double p0x=input.nextDouble();
        double p0y=input.nextDouble();
        double p1x=input.nextDouble();
        double p1y=input.nextDouble();
        double p2x=input.nextDouble();
        double p2y=input.nextDouble();

        double comparison = (p1x - p0x)*(p2y - p0y) - (p2x - p0x)*(p1y - p0y);

        if (comparison > 0)
            System.out.println("p2 is on the left side of the line.");
        else if (comparison == 0)
            System.out.println("p2 is on the same line.");
        else
            System.out.println("p2 is on the right side of the line.");
    }
}