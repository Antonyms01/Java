//5) create a class MyNum with//
//		private int num;
//		parameterized constructor
//
//	
//Demo class with main
//	create 4 objects of MyNum by passing different integers.
//	store these 4 objects inside "ArrayList"
//	and now store that ArrayList inside file system.
//	
//	read ArrayList from file and traverse it using Iterator.
//	
//	
	
	package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class one  implements Serializable
	{
	private int num;
		one(int num)
		{
			this.num=num;
		}
		@Override
		public String toString() {
			return "one [num=" + num + "]";
		}
		
//		public int getnum()
//		{
//			return this.num;
//		}
		
		
		
	}
public class Q5 implements Serializable{

	public static void main(String[] args) throws Exception {
		one o=new one(10);
		one o1=new one(20);
		one o2=new one(30);
		one o3=new one(40);
		
		ArrayList<one> l=new ArrayList<one>();
		l.add(o);
		l.add(o1);
		l.add(o2);
		l.add(o3);
		
		System.out.println(l);
		try(FileOutputStream fos=new FileOutputStream("a"+ "b.ser"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(l);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	try(FileInputStream fis=new FileInputStream("ab.ser"))
	{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			one ref = (one)ois.readObject(); 
			System.out.println(l);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
    Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			//Integer temp=(Integer)itr.next();
			System.out.println(itr.next());
		}
	}
		
		

        
  
    
     
 
	

}
