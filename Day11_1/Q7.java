//7) create a HashMap.
//store  prn no. and students name of 10 students inside the HashMap.
//display it using iterator.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q7 implements Serializable {

	public static void main(String[] args) {
		Map<Integer,String>mymap=new HashMap<>();
		int prn;
		String name;
		mymap.put(1,"Sohan");
		mymap.put(2,"Sarode");
		
	try(FileOutputStream fos=new FileOutputStream("abc.txt"))
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(mymap);
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
		
		Map<Integer,String>map1=null;
		
		try(FileInputStream fis=new FileInputStream("abc.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				map1=(HashMap)ois.readObject();
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
		
		
		Set<Entry<Integer,String>>s=map1.entrySet();
		
		Iterator<Entry<Integer,String>>i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String>me=(Entry<Integer,String>)i.next();
			System.out.println(me.getValue());
			System.out.println(me.getKey());
		}
	}

}
