public class Q7{
	
	public static void main(String[] args){
		double result=(1.0-(1.0/3.0)+(1.0/5.0)-(1.0/7.0)+(1.0/9.0)-(1.0/11.0)+(1.0/13.0));
		
		double result2=1.0;
		double tmp=1.0;
		result2-=1.0/3.0;
		for (double i=5.0;i<10000.0;i+=2.0)
		{
			result2 += (1.0/i)*tmp;
			
			if(tmp<0)
				tmp=1;
			else
				tmp=-1;
		}
		result2=result2*4;
		System.out.println("Result => "+result2);
	}
}