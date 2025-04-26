package Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> s = new TreeSet();
		s.add("Vrushal");
		s.add("Vrushal");
		s.add("vrushal");
		s.add("Shreyas");
		
		for(String str:s) {
			System.out.println(str+" "+" "+s);
			
		}

	}

}
