public class Circle96 {
    /** The radius of the circle */
    double radius;

    /** The number of objects created */
    static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    Circle96() {
        radius = 1;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    Circle96(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}