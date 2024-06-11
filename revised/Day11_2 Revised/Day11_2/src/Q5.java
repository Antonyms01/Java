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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyNum
{
	private int num;
	
	MyNum(int num)
	{
		this.num=num;
	}

	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
	
	
}
public class Q5 implements Serializable {

	public static void main(String[] args) {
		MyNum m=new MyNum(10);
		MyNum m1=new MyNum(20);
		MyNum m2=new MyNum(30);
		MyNum m3=new MyNum(40);
		
		List<MyNum>l=new ArrayList<MyNum>();
		l.add(m);
		l.add(m1);
		l.add(m2);
		l.add(m3);
		
		try(FileOutputStream fos=new FileOutputStream("xyz.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(fos);
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
		
		List<MyNum> ref=null;
		
		try(FileInputStream fis=new FileInputStream("xyz.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				ref=(ArrayList)ois.readObject();
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
		
		Iterator i= l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
