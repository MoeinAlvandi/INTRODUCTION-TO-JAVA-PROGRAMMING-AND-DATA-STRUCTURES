import java.util.Scanner;

public class Q27 {
    /*
     ** 3.27 (Geometry: points in triangle?) Suppose a right triangle is placed in a
     * plane as
     * shown below. The right-angle point is placed at (0, 0), and the other two
     * points
     * are placed at (200, 0) and (0, 100). Write a program that prompts the user to
     * enter
     * a point with x- and y-coordinates and determines whether the point is inside
     * the
     * triangle. Here are the sample runs:
     * 
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // the first line

        int AX=200;
        int AY=0;

        int BX=0;
        int BY=100;

        int CX=0;
        int CY=0;
        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x=input.nextDouble();
        double y=input.nextDouble();

        double determinant = (BX - AX) * (CY - AY) - (BY - AY) * (CX - AX);

        if
        (
           determinant * ((BX - AX) * (y - AY) - (BY - AY) * (x - AX)) >= 0 &&
           determinant * ((CX - BX) * (y - BY) - (CY - BY) * (x - BX)) >= 0 &&
           determinant * ((AX - CX) * (y - CY) - (AY - CY) * (x - CX)) >= 0
        )
            System.out.println("The point is in the triangle!");
        else
            System.out.println("The point is not in the triangle!");


    }
}