package exc;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num:");
		int a=sc.nextInt();
		Calculator c=new Calculator();
		
		try
		{
			int result=c.caldouble(a);
			System.out.println(result);
		}
		catch(MyArithException e)
		{
			System.out.println(e);
		}
		
		
	}

}