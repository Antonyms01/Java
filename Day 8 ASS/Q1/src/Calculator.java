//1) define your exception class by name "MyArithException"
//(MyArithException.java)
//define class "Calculator"   (Calculator.java)
//In this class define a function,which will accept an int and return double of it.
//e.g int caldouble(int)
//This function will check an int which is passed to it
//It will raise the  exception if 0 is passed or negative passed
//in case of 0 caller of this method should get error message
//"Zero not allowed" 
//in case of negative caller of this method should get error message
//"negative not allowed"
//In case of positive value it should simply return the double value.
//	[ this method shouldn't handle the exception]
//
//Now define class "MyCalcApp" (MyCalcApp.java)
//In this class you accept a number from user and pass that no. to
//caldouble() method which is mentioned above.


public class Calculator 
{
	public int caldouble(int num) throws MyArithException
	{
	if(num<=0)
	{
		throw new MyArithException("Negative not allowed");
	}
	else if(num==0)
	{
		throw new MyArithException("Zero is not allowed");
	}
	return num*num;
}
}
