//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Iterator;
//
//
//
//public class Demo {
//
//	public static void main(String[] args) {
//		List <Integer> l=new ArrayList<Integer>();
//		l.add(10);
//		l.add(20);
//		l.add(30);
//		l.add(40);
//		System.out.println(l);
//		
//		ListIterator <Integer>ltr=l.listIterator();
//		//ListIterator ltr1=l.listIterator();
//		ltr.add(12);
//		
//	while(ltr.hasNext())
//	{
//		int i = ltr.next();
//		if(i==30)
//		{
//			ltr.remove();
//		}
//		System.out.println(l);
//	}
//	ltr.set(90);
//	
//	ListIterator <Integer> ltr1=l.listIterator();
//
//	while(ltr1.hasNext())
//	{
//		int k=ltr1.next();
//		if(k==20)
//
//		{
//			ltr1.remove();
//		}
//		System.out.println(l);
//	}
//	}
//
//	
//}

//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.Iterator;
//
//
//public class Demo
//{
//	public static void main(String[] args) {
//		//List l=new ArrayList();
//		CopyOnWriteArrayList list=new CopyOnWriteArrayList();
//		list.add("Sohan");
//		list.add("Sarode");
//		Iterator i=list.iterator();
//		int j=0;
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			list.add("ME");
//			//list.set("Meee");
//			i.remove();
//		}
//		
		
//		Iterator i1=list.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//}
//}

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class Demo
//{
//	public static void main(String[] args) {
//		Map<String,Integer>m=new HashMap<>();
//		m.put("Sohan", 1);
//		m.put("Mrunal",2);
//		m.put("Mehul",3);
//		System.out.println(m);
//		Integer no=m.get(1);
//		System.out.println(no);
//		m.put("Me", 1);
//		System.out.println(m);
//		Set<Entry<String, Integer>>s=m.entrySet();
//		Iterator<Entry<String, Integer>>i=s.iterator();
//		while(i.hasNext())
//		{
//			Map.Entry<String,Integer>me=(Entry<String,Integer>)i.next();
//			System.out.println(me.getValue());
//			System.out.println(me.getKey());
//		}
//	
//		
//		Integer num=m.get("Mrunal");
//		m.put("Mrunal" ,num+10);
//		System.out.println("Mrunal's New Num:"+m.get("Mrunal"));
//		 
//		
//	}
//}






//import java.util.*;
//public class Demo
//{
//	public static void main(String args[])
//	{
//		List<String> mylist=new ArrayList<String>();
//		mylist.add("hello");
//		mylist.add("welcome");
//		mylist.add("all the best");
//		// now let's create iterator 
//
//		Iterator itr=mylist.iterator();
//		while(itr.hasNext())
//		{
//			
//			System.out.println(itr.next());
//		}
//	}
//}
/*  "hasNext()" method checks whether there are elements inside list for traversal. it returns true or false.  */

/* "next()" method returns the current element and places the record pointer on the next element */




interface emp
{
	void disp();
}
public class Demo
{
			
	static emp getEmp()
	{
		return new emp()
		{
			public void disp()
			{
				System.out.println("in disp");
			}
			static
			{
				System.out.println("in anonymous class static block");
			}
		};
	}
	static emp getEmp1()
	{
		emp e=new emp()
		{
			public void disp()
			{
				System.out.println("in disp diff way");
			}
		};
		return e;
	}
	public static void main(String args[])
	{
		emp e1=Demo.getEmp();
		e1.disp();
		emp e2=Demo.getEmp1();
		e2.disp();
	}
}	
	







