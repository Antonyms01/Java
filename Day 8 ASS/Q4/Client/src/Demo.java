import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String pass=sc.next();
		
		try {
			Authenticator A=new Authenticator(pass);
			A.Done();
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
