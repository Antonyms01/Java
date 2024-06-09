//1) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display characters from A to J.


class Th extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("aA")) {
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
			
		}
		}
		
		if(Thread.currentThread().getName().equalsIgnoreCase("bB")) {
			for(char i='A';i<='J';i++)
			{
				System.err.println(i);
				
			}
			}
		
	}
}

public class Q1
{
	public static void main(String[] args) {
		
		Th t = new Th();
		Th t1 = new Th();
		
		t.setName("aa");
		t1.setName("bb");
		t.start();
		t1.start();
		
	}
}