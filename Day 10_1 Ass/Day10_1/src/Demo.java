//import java.io.*;
//import java.util.*;
//public class Demo
//{
//	public static void main(String args[])
//	{
//		try
//		{
//		FileOutputStream fos=new FileOutputStream("D:\\VITA\\Java\\Day_11\\abc.txt");
//		DataOutputStream dos=new DataOutputStream(fos);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter numbers, 0 to quit");
//		while(true)
//		{
//			int k=sc.nextInt();
//			if(k==0)
//			{
//				break;
//			}
//			dos.writeInt(k);
//		}
//		dos.close();
//		fos.close();
//
//		FileInputStream fis=new FileInputStream("D:\\VITA\\Java\\Day_11\\abc.txt");
//		DataInputStream dis=new DataInputStream(fis);
//		while(dis.available()>0)
//		{
//			System.out.println(dis.readInt());
//		}
//		dis.close();
//		fis.close();
//		}
//		catch(IOException ie)
//		{
//			ie.printStackTrace();
//		}
//	}
//}




//public class Demo
//{
//	public static void main(String[] args) {
//		int num=10;
//		assert(num<=10);
//		{
//			System.out.println("in assert");
//		}
//		assert(num>10);
//		{
//			System.out.println("in assert1");
//		}
//	}
//}








//import java.util.Arrays;
//
//class Center  // Immutable class
//{
//	private String name,address;
//	private int prnnos[];
//	//private int prnnos[]= {100,200,300,400,500};
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	
//	public int[] getPrnnos() {
//		//int prncopy[]= {100,200,300,400,500};
//		int[] prncopy=prnnos.clone();
//		return prncopy;
//	}
//	
//	public Center(String name, String address, int[] prnnos) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.prnnos = prnnos;
//	}
//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "Center [name=" + name + ", address=" + address + ", prnnos=" + Arrays.toString(prnnos) + "]";
//	}
//	
//}
//public class Demo
//{
//	public static void main(String args[])
//	{
//		Center c1=new Center("Vita","mumbai",new int[]{100,200,300,400,500});
//		System.out.println(c1);
//		
//
//		// c1.setName    --- not possible
//		// c1.setAddress  --- not possible
//		// c1.setPrnnos   --- not possible
//
//		int temp[]=c1.getPrnnos();
//		System.out.println("let's display all prnnos");
//		for(int i=0;i<temp.length;i++)
//		{
//			System.out.println(temp[i]);
//		}
//		temp[1]=0;  // No problem as we are modifying copy
//		System.out.println(c1);
//		for(int h:temp)
//		{
//			System.out.println(h);
//		}
//	}
//}







//class Engine
//{
//	private int speed;
//
//	public Engine(int speed) {
//		super();
//		this.speed = speed;
//	}
//
//	public int getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	@Override
//	public String toString() {
//		return "Engine [speed=" + speed + "]";
//	}
//	
//}
//class Car implements Cloneable
//{
//	private Engine ref;
//	private String name;
//	public Car(String name) {
//		super();
//		this.name = name;
//		this.ref=new Engine(100);
//	}
//	public Engine getRef() {
//		return ref;
//	}
//	public void setRef(Engine ref) {
//		this.ref = ref;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//         @Override
//	public Object clone()
//	{
//		Car ob=null;
//		try {
//			 ob=(Car)super.clone();
//		}
//		catch (CloneNotSupportedException e) 
//		{
//			
//			e.printStackTrace();
//		}
//		ob.ref=new Engine(ref.getSpeed());
//		return ob;
//	}
//	@Override
//	public String toString() {
//		return "[name=" + name + " ref=" + ref + "]";
//	}
//	
//}
//public class Demo
//{
//  public static void main(String[] args)
//  {
//	  Car c=new Car("Nano");
//	  Car c1=(Car)c.clone();
//	  System.out.println(c);
//	  System.out.println(c1);
//	  
//	  c1.getRef().setSpeed(400);
//	  
//	  System.out.println("After Modification");
//	  
//	  System.out.println(c);
//	  System.out.println(c1);
//  }
//}
//




//
//import java.lang.reflect.*;
//class base
//{
//	Object disp()
//	{
//		System.out.println("in base disp");
//		return null;
//	}
//}
//class sub extends base
//{
//	String disp()
//	{
//		System.out.println("in sub disp");
//		return null;
//	}
//}
//public class Demo
//{
//	public static void main(String args[])
//	{
//		base ref=new sub();
//		ref.disp();
//		try
//		{
//		Class c=Class.forName("sub");
//		Method arr[]=c.getDeclaredMethods();
//		System.out.println(arr.length);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//			System.out.println(arr[i].isBridge());
//		}
//		}
//		catch(Exception ee)
//		{
//			ee.printStackTrace();
//		}
//	}
//}





//import java.util.*;
//class one 
//{
//	void disp1()
//	{
//		System.out.println("in disp1");
//	}
//}
//class two
//{
//	void disp2()
//	{
//		System.out.println("in disp2");
//	}
//}
//class three
//{
//	void disp3()
//	{
//		System.out.println("in disp3");
//	}
//}
//
//public class Demo
//{
// static Object createObject(String className) 
//{
//      Object object = null;
//      try {
//          Class classDefinition = Class.forName(className);
//          object = classDefinition.newInstance();
//      } 
//	catch (InstantiationException e) // if there is no default constr
//	{
//          System.out.println(e);
//      	} 
//	catch (IllegalAccessException e) // if constr is not accessible
//	 {
//          System.out.println(e);
//      	}
//	 catch (ClassNotFoundException e)
//	 {
//          System.out.println(e);
//     	 }
//      return object;
//   }
//
//
//	public static void main(String args[])
//	{
//		try
//		{
//			System.out.println("Enter class name which you want to instantiate");
//			Scanner sc=new Scanner(System.in);
//			String str=sc.next();
//			Object ob=createObject(str);
//			if(ob instanceof one)
//			{
//				((one)(ob)).disp1();
//			}
//			else if(ob instanceof two)
//			{
//				((two)(ob)).disp2();
//			}
//			else if(ob instanceof three)
//			{
//				((three)(ob)).disp3();
//			}
//		}
//		catch(Exception ee)
//		{
//			System.out.println(ee);
//		}
//	}
//}
//




//
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
//class Sample
//{
//	private int num1=200;
//	public int num2=400;
//	public Sample()
//	{
//		System.setSecurityManager(new SecurityManager());
//	}
//	private void disp1()
//	{
//		System.out.println("in disp1");
//	}
//	public void disp2()
//	{
//		System.out.println("in disp2");
//	}
//	public int getNum1()
//	{
//		return num1;
//	}
//}
//public class Demo
//{
//		public static void main(String args[])
//		{
//			try
//			{
//				Class c=Class.forName("Sample");
//				
//				Method m=c.getDeclaredMethod("disp1",null);
//			
//				Sample s=new Sample();
//
//				m.setAccessible(true); 
//
//				m.invoke(s,null);
//				
//				System.out.println("Before modifying\t"+s.getNum1());
//				
//				Field value = c.getDeclaredField("num1");
//				 value.setAccessible(true);  
//			      
//			    value.set(s,120);
//			    
//			    System.out.println("After modifying\t"+s.getNum1());
//
//				
//			}
//			catch(Exception ee)
//			{
//				System.out.println(ee);
//			}
//		}
//}





//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class MyAccount implements Serializable { 
//  
//    private String username = "scott"; 
//  
//    private String pwd = "tiger";
//
//	/**
//	 * @return the username
//	 */
//	public String getUsername() {
//		return username;
//	}
//
//	/**
//	 * @param username the username to set
//	 */
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	/**
//	 * @return the pwd
//	 */
//	public String getPwd() {
//		return pwd;
//	}
//
//	/**
//	 * @param pwd the pwd to set
//	 */
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	} 
//    
//    
//  
//} 
//  
//public class Demo { 
//    public static void main(String[] args) throws Exception 
//    { 
//        MyAccount account = new MyAccount(); 
//  
//        System.out.println("Username : " + account.getUsername() +  
//                                 "    Password : " + account.getPwd()); 
//  
//        FileOutputStream fos = new FileOutputStream("abc.ser"); 
//  
//        ObjectOutputStream oos = new ObjectOutputStream(fos); 
//  
//      
//        oos.writeObject(account); 
//  
//        FileInputStream fis = new FileInputStream("abc.ser"); 
//  
//        ObjectInputStream ois = new ObjectInputStream(fis); 
//  
//      
//        MyAccount ref = (MyAccount)ois.readObject(); 
//  
//        System.out.println("Username : " + ref.getUsername() +  
//                               "      Password : " + ref.getPwd()); 
//    } 
//} 





//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class MyAccount implements Serializable { 
//  
//    private String username = "scott"; 
//  
//    private transient String pwd = "tiger";
//    
//
//    public void setUsername(String username) {
//		this.username = username;
//	}
//    
//    
//	public String getUsername() {
//		return username;
//	}
//
//	
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	} 
//    
//
//	
//	public String getPwd() {
//		return pwd;
//	}  
//} 
//  
//public class Demo { 
//    public static void main(String[] args) throws Exception 
//    { 
//        MyAccount account = new MyAccount(); 
//  
//        System.out.println("Username : " + account.getUsername() +  
//                                 "    Password : " + account.getPwd()); 
//  
//        FileOutputStream fos = new FileOutputStream("d:\\abc.txt"); 
//  
//        ObjectOutputStream oos = new ObjectOutputStream(fos); 
//  
//      
//        oos.writeObject(account); 
//  
//        FileInputStream fis = new FileInputStream("d:\\abc.txt"); 
//  
//        ObjectInputStream ois = new ObjectInputStream(fis); 
//  
//      
//        MyAccount ref = (MyAccount)ois.readObject(); 
//  
//        System.out.println("Username : " + ref.getUsername() +  
//                               "      Password : " + ref.getPwd()); 
//    } 
//} 
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class MyAccount implements Serializable { 
//  
//    private String username = "scott"; 
//  
//    private transient String pwd = "tiger";
//
//	/**
//	 * @return the username
//	 */
//	public String getUsername() {
//		return username;
//	}
//
//	/**
//	 * @param username the username to set
//	 */
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	/**
//	 * @return the pwd
//	 */
//	public String getPwd() {
//		return pwd;
//	}
//
//	/**
//	 * @param pwd the pwd to set
//	 */
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	} 
//    private void readObject(ObjectInputStream o) throws ClassNotFoundException, IOException
//    {
//    	o.defaultReadObject();
//    	pwd="tiger";
//    }
//} 
//  
//public class Demo { 
//    public static void main(String[] args) throws Exception 
//    { 
//        MyAccount account = new MyAccount(); 
//  
//        System.out.println("Username : " + account.getUsername() +  
//                                 "    Password : " + account.getPwd()); 
//  
//        FileOutputStream fos = new FileOutputStream("d:\\abc.txt"); 
//  
//        ObjectOutputStream oos = new ObjectOutputStream(fos); 
//  
//      
//        oos.writeObject(account); 
//  
//        FileInputStream fis = new FileInputStream("d:\\abc.txt"); 
//  
//        ObjectInputStream ois = new ObjectInputStream(fis); 
//  
//      
//        MyAccount ref = (MyAccount)ois.readObject(); 
//  
//        System.out.println("Username : " + ref.getUsername() +  
//                               "      Password : " + ref.getPwd()); 
//    } 
//} 







import static java.lang.System.*;
import java.util.*;
class shape
{
	shape draw()
	{
		return this;
	}
}
class triangle extends shape
{
	shape draw()
	{
		return this;
	}
}
class rect extends shape
{
	shape draw()
	{
		return this;
	}
}
class common<T extends shape>

{
	 T ob;
	public common(T ob)
	{
		this.ob=ob;
	}
	public T fun()
	{
		return ob;
	}
}
public class Demo
{
	
	public static void main(String args[])
	{
		common<rect> c1=new common<rect>(new rect());
		rect r=c1.fun();
		out.println("in main   "+r);

		common<triangle> c2=new common<triangle>(new triangle());
		triangle t=c2.fun();
		out.println("in main   "+t);
	
	}
}











