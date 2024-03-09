public class Q10{
	
	public static void main(String[] args){
		
		double HourSecound=3600;
		
		double VHoureSecound=(45 *60 )+30;
		
		double AvgKmH=((((14*VHoureSecound) /HourSecound)/60)/60);

		double AvgMileH=AvgKmH/4.6;
		
		System.out.println("average speed in miles per is => "+ AvgMileH);
	}
}