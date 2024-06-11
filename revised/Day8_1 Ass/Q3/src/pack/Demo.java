//3) define "MyException" as a checked exception.
//
//define a class "Demo" with 
//	public void show1(), public void show2() , public void show3() and main functions.
//
//inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
//	[ this method shouldn't handle the exception]
//
//main() function should call "show1()" , 
//show1() function should call "show2()",
//show2() function should call "show3()"
//
//show2() should not handle the exception but show1() should handle.


package pack;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show1();
	}
	
	
	public void show1() 
	{
		try
		{
			int k=show2();
			System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public int show2() throws MyException 
	
	{
		return show3();
		
	}
	
	public int show3() throws MyException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num:");
		int k=sc.nextInt();
		
		if(k>10)
		{
			throw new MyException("Num is Greater");
		}
		return k;
	}
	

		
	
}
