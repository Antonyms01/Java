//1) accept 10 numbers from user and add them inside the ArrayList.
//using ListIterator display all the numbers bidirectionally.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>l=new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			l.add(sc.nextInt());
		}
		
		ListIterator <Integer> ltr=l.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.err.println(ltr.previous());
		}
		
		
		
	}
}