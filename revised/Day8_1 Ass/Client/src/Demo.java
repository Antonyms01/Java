//
//2) on the developer side create an exception:
//	NumberNotDivisibleBySevenException
//	as a checked exception
//
//create necessary jar and documentation.
//
//on client side
//	public class MyMath class with 
//		public void disp(int num)
//this disp() method will check if the number passed is not divisible by 7 , 
//it will raise "NumberNotDivisibleBySevenException" or else it will simply display the number passed.
//	[ this method shouldn't handle the exception]
//
//	public class Demo
//		main function 
//		invoke "disp()" of "MyMath" class.
//		

import java.util.Scanner;

import pack.NumberNotDivisibleBySevenException;

public class Demo {

	public static void main(String[] args) {
		Mymath m=new Mymath();
		System.out.println("Enter a Num:");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		
		
		try
		{
			int result=sc.nextInt(x);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
