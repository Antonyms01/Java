//4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
//define a class "CalcDemo" with main method.
//inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.


package pack;
import java.util.*;

import java.util.Scanner;

interface Calculator
{
	abstract int multiply(int a,int b);
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		Calculator ref=(int a,int b)->{return a*b;};
		System.out.println(ref.multiply(x,y));
		
	}

	
}
