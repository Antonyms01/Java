package pack;



//interface sport
//{
//	String wish(String name);
//	default void disp()
//	{
//		System.out.println("in disp");
//	}
//	
//	static void disp1()
//	{
//		System.out.println("In static disp1");
//	}
//}
//
//public class Demo
//{
//	public static void main(String[] args) {
//		sport ref=(String name) -> {return "Name:"+name;};
//		System.out.println(ref.wish("Sohan"));
//		System.out.println(ref.getClass().getName());
//		ref.disp();		
//		}
//}



interface sport
{
	String wish(String name);
	
}

public class Demo
{
	static void disp(sport ref)
	{
		System.out.println(ref.wish("Sohan"));
	}
	
	public static void main(String[] args) {
		Demo.disp((String name)->{return name;});
		
		
	}
}



