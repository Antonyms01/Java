//Question:
//
//define a class Player
// 	with
//		int playerid
//		String name
//		int runs
//		String countryname
//
//		define
//			parameterized constructor and getter methods
//
//create 10 players and store them inside a list.
//
//using java8 stream api:

//1) display all the players representing "India".
//
//	hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.
//
//
//2) find out how many players have scored more than 5000 runs.
//
//	hint:- use "filter" to check players scored more than 5000 runs and "count" method to count them.
//

import java.util.ArrayList;
import java.util.List;

class Player
{
	int playerid;
	String name;
	int run;
	String Countryname;
	
	
	public int getPlayerid() {
		return playerid;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getRun() {
		return run;
	}
	
	
	public String getCountryname() {
		return Countryname;
	}


	public Player(int playerid, String name, int run, String countryname) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.run = run;
		Countryname = countryname;
	}
	
	
	
	
}
public class Q3 {

	public static void main(String[] args) {
		List<Player>list=new ArrayList();
		
		Player p1=new Player(1,"Rohit",100,"India");
		Player p2=new Player(2,"Dhoni",90,"India");
		Player p3=new Player(3,"Rohit",70,"India");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		list.stream().filter(s->s.getCountryname().equalsIgnoreCase("india")).forEach(System.out::println);
		System.out.println(list.stream().filter(s->s.getCountryname().equalsIgnoreCase("India")).mapToInt(s->s.getRun()).sum());
		System.out.println(list.stream().filter(s->s.getRun()>70).count());

	}

}
