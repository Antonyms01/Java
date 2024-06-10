//6) create a class "MyClass".//
//create 5 different objects of it.
//add them in a ArrayList.
//store ArrayList in file.
//Now open a file, read ArrayList and display all objects.
//

package day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Myclass
{
	int num;
	Myclass(int num)
	{
		this.num=num;
	}
}
public class Q6 {
	public static void main(String[] args) {
		
		Myclass m=new Myclass(10);
		Myclass m1=new Myclass(20);
		Myclass m2=new Myclass(30);
		Myclass m3=new Myclass(40);
		Myclass m4=new Myclass(50);
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(m);
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		
		
		try(FileOutputStream fos=new FileOutputStream("abc.ser"))
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
		
		
		try(FileInputStream fis=new FileInputStream("abc.ser"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				one ref = (one)ois.readObject(); 
				System.out.println(a);
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
	}

	
	
	
}
