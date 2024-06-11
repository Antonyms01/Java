//
//4) add 5 numbers inside CopyOnWriteArrayList and show how can you add one more number at the same 
//time of traversal through its iterator.

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Q4 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer>l=new CopyOnWriteArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		
		Iterator <Integer>ltr=l.iterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			l.add(60);
		}
	System.out.println(l);
		
		
		

	}

}
