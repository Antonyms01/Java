package day11;
//
//public class Demo<T> {
//	private T ob;
//	
//	Demo()
//	{
//		
//	}
//	public T getOb() {
//		return ob;
//	}
//
//
//	public void setOb(T ob) {
//		this.ob = ob;
//	}
//	Demo(Character a)
//	{
//		System.out.println(a);
//	}
//
//
//	public static void main(String[] args) {
//		Demo<String> s=new Demo<String> ();
//		s.setOb("Sohan");
//		System.out.println(s.getOb());
//		
//		Demo<Character>s1=new Demo<Character>('s');
//		//s1.setOb('s');
//		//System.out.println(s1.getOb());
//	}
//
//}


interface Shape
{
	void me();

}

class Circle implements Shape
{
	public void me()
	{
		System.out.println("Inside Circle");
	}
}

class Triangle implements Shape
{
	public void me()
	{
		System.out.println("Inside triangle");
	}
}

class common <T extends Shape>
{


	T ob;
	void common(T ob)
	{
		this.ob=ob;
		
	}
	
	public void fun()
	{
		ob.me();
	}
	
	
	
}
public class Demo<T>
{
	public static void main(String[] args) {
//		common<Circle>c=new common<Circle>(new Circle());
//		//System.out.println(c.me());
//		c.me();
//		common<Triangle>T=new common<Triangle>(new Triangle());
//		//System.out.println(T.me());
//		T.me();
		
		//common<Triangle>t=new common<Triangle>(new Triangle());
		common<Triangle> c1=new common<Triangle>(new Triangle());
		t.fun();
		common<Circle>c=new common<Circle>(new Circle());
		c.fun();
		
		
		
		
	}
	

	
}

