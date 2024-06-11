

/*1) accept 10 numbers from user and add them inside the ArrayList.
using ListIterator display all the numbers bidirectionally.*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> mylist= new ArrayList<Integer>();
		System.out.println("Enter 10 numbers into ArrayList");

		for (int i = 0; i<10; i++)
		{
			mylist.add(sc.nextInt());
		}
		
		ListIterator ltr = mylist.listIterator();
		System.out.println("Traversing ArrayList from beginning");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("Traversing ArrayList from end");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		System.out.println();
		System.out.println(mylist);
	}

}
