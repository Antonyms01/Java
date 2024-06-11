package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

//package pack;
//
//
//import java.io.IOException;
//
//public class Demo
//{
//	void disp3()throws IOException
//	{
//		int num=20;
//		if(num>10)
//		{
//			throw new IOException();
//		}
//	}
//	void disp2()throws IOException
//	{
//		disp3();
//	}
//	void disp1()throws IOException
//	{
//		disp2();
//	}
//	public static void main(String args[]) throws IOException
//	{
//		Demo j=new Demo();
//		j.disp1(); // compilation error : add throws or try_catch
//	}
//}





//1) define a functional interface "First" with an abstract method "void disp1()" , default method
//"void disp2()" and a static method "void disp3()"
//
//inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
//also invoke "disp3()" method inside main.



//interface First
//
//{
//	void disp1();
//	
//	default void disp2()
//	{
//		System.out.println("In Default disp2");
//	}
//	
//	static void disp3()
//	{
//		System.out.println("In static disp3");
//	}
//}
//
//public class Demo
//{
//	public static void main(String[] args) {
//		First ref=()->System.out.println("disp1");
//		ref.disp1();
//		ref.disp2();
//		First.disp3();
//	}	
//}




//
//2) define a functional interface "Second" with an abstract method "void disp4()".
//
//define a class Demo with main function.
//inside main function create two implementations of "Second" using lambda expression and display their names.


//
//interface Second{
//	//String method(name);
//	void disp4();			//Functional Inteface
//}
//
//public class Demo
//{
//	public static void main(String[] args) {
//		Second ref=()->System.out.println("Inside Second Implementation of disp4()");
//		
//		System.out.println(ref.getClass().getName());
//		Second ref1=()->System.out.println("Inside Second Implementation of disp4()");
//		System.out.println(ref.getClass().getName());
//		ref.disp4();	
//		ref1.disp4();
//		
//	}
//}


//
//
//3) define a functional interface "MyInterface" with an abstract method "void fun()"
//
//define a class Demo with two functions "static void perform" and main.
//
//from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.


//interface Myinterface
//{
//	void fun();
//}
//
//
//public class Demo
//{
//	static void perform(Myinterface ref)
//	{
//		ref.fun();
//	}
//	public static void main(String[] args) {
//		perform(()->{System.out.println("Inside fun()");});

//	}
//}





//
//4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
//define a class "CalcDemo" with main method.
//inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.





//interface Calculator
//{
//	int multiply(int a,int b);
//}
//
//public class Demo
//{
//	public static void main(String[] args) {
//		Calculator ref=(int a,int b)->{return a*b;};
//		ref.multiply(10, 20);
//	}
//}





//
//
//
//5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
//
//create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.
//
//create 2 threads and pass above created "Runnable" implementation to these threads.
//make sure while one thread is executing other thread will not interfere.




//class Display
//{
//	synchronized void disp()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//	}
//	
//}
//
//public class Demo
//{
//	public static void main(String[] args) {
//		Display d=new Display();
//		Runnable ref=()->{d.disp();};
//		
//		Thread t1=new Thread(ref);
//		Thread t2=new Thread(ref);
//		
//		t1.start();
//		t2.start();
//		
//	}
//}



//interface  Animal
//{
//	void sound();
//	
//}
//
//
//class Tiger implements Animal
//{
//	public void sound()
//	{
//		System.out.println("Roar");
//	}
//}
//
//class Elephant implements Animal
//{
//	public void sound()
//	{
//		System.out.println("Don't Know");
//	}
//	
//	void innocent()
//	{
//		System.out.println("I am innocent");
//	}
//}
//
//public class Demo
//{
//	static void perform(Animal ref)
//	{
//		if(ref instanceof Elephant)
//		{
//			Elephant ref1=(Elephant)ref;
//			ref1.innocent();
//		}
//		ref.sound();
//	}
//	public static void main(String[] args) {
//		Tiger t=new Tiger();
//		Elephant E=new Elephant();
//		
//		perform(()-> {t.sound();});
//		
//		perform(()->{E.innocent();});
//		perform(()->{E.sound();});
//	}	
//}




//1) accept 10 numbers from user and add them inside the ArrayList.
//using ListIterator display all the numbers bidirectionally.


//public class Demo
//{
//	public static void main(String[] args) {
//		List<Integer>l=new ArrayList<Integer>();
//		Scanner sc=new Scanner(System.in);
//		int k=0;
//		for(int i=1;i<=10;i++)
//		{
//			l.add(sc.nextInt());
//		}
//		System.out.println(l);
//		
//		ListIterator <Integer>ltr=l.listIterator();	
//		
//		while(ltr.hasNext())
//		{
//			System.out.println(ltr.next());
//		}
//		
//		while(ltr.hasPrevious())
//		{
//			System.out.println(ltr.previous());
//		}
//	}
//}


//3) create LinkedList with the values 10,20,30 and 40.//
//display it.
//now insert 500 in the beginning.
//	insert 400 at 2nd position.
//	add 1000 at the end.
//display the list again.

//public class Demo
//{
//	public static void main(String[] args) {
//		LinkedList <Integer>l=new LinkedList();
//		l.add(10);
//		l.add(20);
//		l.add(30);
//		l.add(40);
//		
//		System.out.println(l);
//		
//		l.add(0,500);
//		System.out.println(l);
//		
//		l.add(1,400);
//		System.out.println(l);
//		
//		l.add(6,1000);
//		System.out.println(l);
//		
//		
//	}
//}


//
//4) add 5 numbers inside CopyOnWriteArrayList and show how can you add one more number at the same time of traversal through its iterator.



//public class Demo
//{
//	public static void main(String[] args) {
//		List <Integer>c=new CopyOnWriteArrayList<>(); 
//		c.add(10);
//		c.add(20);
//		c.add(30);
//		
//		System.out.println(c);
//		
//		ListIterator <Integer>i=c.listIterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			c.add(40);
//		}
//		
//		//i=null;
//		Iterator<Integer>i1=c.iterator();
//		System.out.println("New Iteration");
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//		
//	}
//}



////5) create a class MyNum with//
////private int num;
////parameterized constructor
////
////
////Demo class with main
////create 4 objects of MyNum by passing different integers.
////store these 4 objects inside "ArrayList"
////and now store that ArrayList inside file system.
////
////read ArrayList from file and traverse it using Iterator.

//class Mynum implements Serializable
//{
//	private int num;
//
//	public Mynum(int num) {
//		super();
//		this.num = num;
//	}
//
//	@Override
//	public String toString() {
//		return "Mynum [num=" + num + "]";
//	}
//	
//	
//}
////
//class Demo
//{
//	public static void main(String[] args) {
//		Mynum m1=new Mynum(10);
//		Mynum m2=new Mynum(20);
//		Mynum m3=new Mynum(30);
//		Mynum m4=new Mynum(40);
//		
//		List<Mynum>l=new ArrayList<Mynum>();
//		l.add(m1);
//		l.add(m2);
//		l.add(m3);
//		l.add(m4);
//		
//		System.out.println(l);
//		
//		try(FileOutputStream fis=new FileOutputStream("xyz.txt"))
//				{
//					try(ObjectOutputStream ois=new ObjectOutputStream(fis))
//					{
//						ois.writeObject(l);
//					}
//					catch(Exception e)
//					{
//						System.out.println(e);
//					}
//				}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//		List<Mynum>ref=null;
//		
//		try(FileInputStream fis=new FileInputStream("xyz.txt"))
//		{
//			try(ObjectInputStream ois=new ObjectInputStream(fis))
//			{
//				ref=(ArrayList)ois.readObject();
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		//System.out.println("Inside Copied ArrayList:"+ref);
//		
//		Iterator i=ref.iterator();
//		while(i.hasNext())
//		{
//		System.out.println(i.next());
//		}
//		
//			
//	}
//}




//
//
//7) create a HashMap.
//store  prn no. and students name of 10 students inside the HashMap.
//display it using iterator.



//public class Demo
//{
//	public static void main(String[] args) {
//		Map<Integer,String>m=new HashMap<Integer,String>();
//		m.put(1,"Sohan");
//		m.put(2,"Sarode");
//		System.out.println(m);
//		
//		try(FileOutputStream fos=new FileOutputStream("abc.txt"))
//		{
//			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
//			{
//				oos.writeObject(m);
//				
//			}
//			catch(FileNotFoundException e)
//			{
//				System.out.println(e);
//			}
//			
//		
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		
//		Map<Integer,String>ref=null;
//		
//		try(FileInputStream fis=new FileInputStream("abc.txt"))
//		{
//			try(ObjectInputStream ois=new ObjectInputStream(fis))
//			{
//				ref=(HashMap)ois.readObject();
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		Set<Entry<Integer,String>>entry=ref.entrySet();
//		Iterator<Entry<Integer,String>>i=entry.iterator();
//		
//		while(i.hasNext())
//		{
//			Map.Entry<Integer, String>me=(Entry<Integer, String>)i.next();
//			System.out.println(me.getValue());
//			System.out.println(me.getKey());
//		}
//	}
//}
//






//8) create a hierarchy as follows
//interface Game- play() method
//Derive at least 3 classes from it. ( Cricket, Chess and Football )
//Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
//In this class try to call the play() method of the class which is passed to it.



//interface Game
//{
//	public void play();
//}
//
//Cricket implements Game
//{
//	public void play()
//	{
//		System.err.println("Playing Cricket");
//	}
//}
//
//Chess implements Game
//{
//	void play()
//	{
//		System.out.println("Playing CHess");
//	}
//}
//
//Football implements Game
//{
//	void play()
//	{
//		System.out.println("Playing Football");
//	}
//}
//
//class Generic<T extends Game>
//{
//	T obj;
//	void call(T obj)
//	{
//		obj.play();
//	}
//	
//	
//}
//public class hello
//{
//	public static void main(String[] args) {
//		Generic<Game>g=new Generic<Game>();
//		g.call(new Football());
//		g.call(new Chess());
//		g.call(new Chess());
//		
//		
//	}
//}






//9) maintain ICC ranking of at least 5 batsmen in the "HashMap".
//list should be maintain as "rank" "name"
//e.g. "1" "Rohit Sharma".
//Now ask any rank bet'n 1 to 5 from user. ( user input).
//if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.





//sort map values in descending order

import java.util.ArrayList;
import java.util.List;

class Person
{
	private String name;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class Demo
{
	public static void main(String[] args)
	{
		Person p1=new Person("lmn",21);
		Person p2=new Person("abc",25);
		List<Person> mylist=new ArrayList<>();
		mylist.add(p1);
		mylist.add(p2);
		System.out.println("original list is\t"+mylist);
	//	mylist.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
		
		
	}
}









	

	