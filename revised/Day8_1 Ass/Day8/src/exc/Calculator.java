package exc;

public class Calculator {
	int caldouble(int a) throws MyArithException
	{
		if(a==0) 
		{
			throw new MyArithException ("Zero Not Allowed");
		}
		
		if(a<0)
		{
			throw new MyArithException ("Negative Not Allowed");
		}
		int result=a*a;
		return result;
	}
}