import java.util.Scanner;

public class Q30 {
    /*
     * 3.30 (Current time) Revise Programming Exercise 2.8 to display the hour using
     * a
     * 12-hour clock. Here is a sample run:
     * 
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");

        int gmt = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;-5
        long currentHour = totalHours % 24;
        currentHour = currentHour + gmt;
        if (currentHour > 12) {
            currentHour = currentHour - 12;
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");

        } else {
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");

        }
    }
}