class CClone
{
	public Object clone1()
	{
		Object obj=null;
		obj=this;		
		return obj;
	}
}

class Asd extends CClone
{
	String s="asdf";
	int arr[]= {1,2,3,4,5};
	
	public int[] getArr()
	{
		int arrCopy[]=arr.clone1();
		return arrCopy;
	}
	
}

public class clone {

	public static void main(String[] args) {
		
		Asd a1=new Asd();
		int temp[]=a1.getArr();

	}

}



