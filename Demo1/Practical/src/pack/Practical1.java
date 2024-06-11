package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mobile implements Serializable
{
	int price;
	String name;
	int model_no;
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getModel_no() {
		return model_no;
	}
	
	
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", name=" + name + ", model_no=" + model_no + "]";
	}
	
	
}
public class Practical1 {

	public static void main(String[] args) {
		
		List<Mobile>list=new ArrayList<>();
		
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		Mobile m4=new Mobile();
		
		m1.setPrice(1000);
		m1.setName("Samsung");
		m1.setModel_no(1);
		
		m2.setPrice(2000);
		m2.setName("Iphone");
		m2.setModel_no(2);
		
		m3.setPrice(3000);
		m3.setName("OnePlus");
		m3.setModel_no(3);
		
		m4.setPrice(4000);
		m4.setName("Xiaomi");
		m4.setModel_no(4);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		System.out.println(list);
		
		try(FileOutputStream fos=new FileOutputStream("xyz.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream (fos))
			{
				oos.writeObject(list);
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		List<Mobile>ref=null;
		
		try(FileInputStream fis=new FileInputStream("xyz.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				ref=(ArrayList)ois.readObject();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Iterator <Mobile>i=ref.iterator();	
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
