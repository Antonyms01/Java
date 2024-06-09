//2) above program  using "implements Runnable" method.


	public class Q2 implements Runnable
	{
		public void run()
		{
			if(Thread.currentThread().getName().equalsIgnoreCase("aa"))
			{
				for(char i='a';i<='j';i++)
				{
					System.out.println(i);
				}
			}
			
			if(Thread.currentThread().getName().equalsIgnoreCase("aa"))
			{
				for(char i='a';i<='j';i++)				{
					System.err.println(i);
				}
			}
		}
	
	public static void main(String[] args) {
		Q2 t=new Q2();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("aa");
		t2.setName("bb");
		t1.start();
		t2.start();
		
	}

	}










