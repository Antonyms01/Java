
//4) on the developer side create following checked exception:
//	InvalidLengthException
//create necessary jar file and documentation.
//
//on client side
//
//public class Authenticator
//	with
//a parameterized constructor which takes String as a password.
//this class also will have "done()" method with "successful authentication" message.
//Parameterized constructor should check the length of the password passed if it is less 
//than 5 or more that 9 ,
//it should raise "InvalidLengthException" 
//	[ constructor shouldn't handle the exception]
//
//create a class "Demo" with main
//	inside main function create the object of "Authenticator" class and invoke "done()" method.


package pack;

public class Authenticator {
	public Authenticator(String pass) throws InvalidLengthException
	{
		if(pass.length()<5 || pass.length()>9)
		{
			throw new InvalidLengthException("Length shold be bet 5-9");
		}
	}
	void done()
	{
		System.out.println("Successful Authentication");
	}
}
