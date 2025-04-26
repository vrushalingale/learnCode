package Maps;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(1, "Vrushal");
		hm.put(4, "Vrushal");
		hm.put(2, "Shreyas");
		hm.put(3, "Kshitij");
		
		for(Entry<Integer, String> li :hm.entrySet()) {
			System.out.println(li);
		}
		
		System.out.println();
		
		Set<Integer> keys =hm.keySet();
		System.out.println(keys.size());
		for(Integer key: keys) {
			System.out.println(key+hm.get(keys));
		}
		
	

	}

}
