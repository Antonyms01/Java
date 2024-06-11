//7) create a HashMap.
//store  prn no. and students name of 10 students inside the HashMap.
//display it using iterator.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map.Entry;

public class Q6 {

	
	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(1, "Sohan");
		m.put(2, "Sarode");
		
		Set<Entry<Integer,String>>s=m.entrySet();
		Iterator<Entry<Integer,String>>i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry<Integer, String>me=(Entry<Integer,String>)i.next();
			System.out.println(me.getValue());
			System.out.println(me.getKey());
		}
	}
		
}
