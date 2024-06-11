//9) maintain ICC ranking of at least 5 batsmen in the "HashMap".
//list should be maintain as "rank" "name"
//e.g. "1" "Rohit Sharma".
//Now ask any rank bet'n 1 to 5 from user. ( user input).
//if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Q9 {

	public static void main(String[] args) {
		Map<Integer, String>m=new HashMap<Integer,String>();
		m.put(1,"Rohit");
		m.put(2,"Virat");
		m.put(3,"Dhoni");
		
		Set<Entry<Integer,String>>s=m.entrySet();
		Iterator<Entry<Integer,String>>i=s.iterator();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rank:");
		int r=sc.nextInt();
		while(i.hasNext())
		{
			Map.Entry<Integer,String>entry=(Entry<Integer,String>)i.next();
			if(r==entry.getKey())
			System.out.println(entry.getValue());
			
		}
		

	}

}
