//3) create LinkedList with the values 10,20,30 and 40.//
//display it.
//now insert 500 in the beginning.
//	insert 400 at 2nd position.
//	add 1000 at the end.
//display the list again.

package day11;

import java.util.LinkedList;

public class Q3 {

	public static void main(String[] args) {
		LinkedList <Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.add(0,500);
		System.out.println(l);
		l.add(1,400);
		System.out.println(l);
		l.add(6,1000);
		System.out.println(l);
		

	}

}
