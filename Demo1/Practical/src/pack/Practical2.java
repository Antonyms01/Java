package pack;

interface Mobile1
{
	void use();
}


class one implements Mobile1
{
	public void use()
	{
		System.out.println("Using one");
	}
}


class two implements Mobile1
{
	public void use()
	{
		System.out.println("Using two");
	}
	
	public void takephoto()
	{
		System.out.println("TakePhoto");
	}
}


public class Practical2 {

	public static void main(String[] args) {
		
		Mobile1 arr[]=new Mobile1[2];
		
		arr[0]=new one();
		arr[1]=new two();
		
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i] instanceof two)
			{
				two ref=(two)arr[i];
				ref.takephoto();
			}
			arr[i].use();
		}
	}

}