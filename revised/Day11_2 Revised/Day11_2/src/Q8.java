//8) create a hierarchy as follows
//	interface Game- play() method
//	Derive at least 3 classes from it. ( Cricket, Chess and Football )
//Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
//In this class try to call the play() method of the class which is passed to it.

interface Game
{
	void play();
}

class Cricket implements Game
{
	public void play()
	{
		System.out.println("Playing Cricket");
	}
}

class Chess implements Game
{
	public void play()
	{
		System.out.println("Playing Chess");
	}
}

class Football implements Game
{
	public void play()
	{
		System.out.println("Playing Football");
	}


}

class Generic <T extends Game>
{
	T obj;
	void call(T obj)
	{
		obj.play();
	}

}
public class Q8 {

	public static void main(String[] args) {
		Generic<Game>g=new Generic<Game>();
		g.call(new Football());
		g.call(new Cricket());
		g.call(new Chess());
		

	}

}