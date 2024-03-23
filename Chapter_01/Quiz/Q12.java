public class Q12{
/**
 * 1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 * minutes, and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 *
 * @author Sharaf Qeshta */


	public static void main(String[] args){

		//24 miles in 1h 40m 35s
		//how many secound
			

		int AllSecound = (1*60*60)+(40*60)+35;
		double onehoure=(24*(60*60))/AllSecound;//Distance covered in one hour mile/h
		
		double DistanceCoveredInKilometer=onehoure*1.6;//Convert Mile  To Kilometer
		
		
		
		System.out.println("average speed is => "+ DistanceCoveredInKilometer + " Kilometer/hour");
	}
}