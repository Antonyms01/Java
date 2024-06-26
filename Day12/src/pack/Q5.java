//5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
//
//create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.
//
//create 2 threads and pass above created "Runnable" implementation to these threads.
//make sure while one thread is executing other thread will not interfere.

package pack;

class Display 
{
	synchronized void disp()
	
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
public class Q5 {

	public static void main(String[] args) {
		Display d=new Display();
		Runnable r=()->{synchronized (d)
			{
			d.disp();
			}
		};
		Thread t=new Thread(r,"First");
		Thread t1=new Thread(r,"Second");
		
		t.start();
		System.out.println("2nd Loop");
		t1.start();
		System.out.println(Thread.currentThread().getName()+d);
		
		
		
		
	}

}
