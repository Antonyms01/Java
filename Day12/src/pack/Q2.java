//2) define a functional interface "Second" with an abstract method "void disp4()".
//define a class Demo with main function.
//inside main function create two implementations of "Second" using lambda expression and display their names.


package pack;

interface Second
{
	void disp4();
}
public class Q2 {

	public static void main(String[] args) {
		Second ref=()->System.out.println("Sohan");
		Second ref1=()->System.out.println("Sarode");
		ref.disp4();
		ref1.disp4();
		}

	}

