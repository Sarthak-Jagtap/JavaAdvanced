import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new TreeMap<Integer,String>();
		
		map.put(10,"Ram");
		map.put(20,"Sita");
		map.put(30,"Lakshaman");
		map.put(40,"Hanuman");
		map.put(50,"Raone");
		
		System.out.println(map);
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		Iterator itr = entries.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> temp = (Map.Entry<Integer, String>) itr.next();
			System.out.println(temp.getKey() + " " + temp.getValue());
		}
		
		System.out.println(map.get(30));
		
		System.out.println("Has Key 30? " + map.containsKey(30));
		System.out.println("Has Valus Sita? " + map.containsValue("Sita"));
		
	}
}

