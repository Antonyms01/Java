package Q2_pack;

public class Demo {

	public static void main(String[] args) {
		MyMath m=new MyMath();
		try {
			int result = m.disp(14);
			System.out.println(result);
		}
		
		catch(NumberNotDivisibleBySevenException NU)
		{
			System.out.println(NU);
		}

	}

}
