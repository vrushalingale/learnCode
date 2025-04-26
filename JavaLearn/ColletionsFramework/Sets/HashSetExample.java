package Sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> s = new HashSet();
		s.add("Vrushal");
		s.add("Vrushal");
		s.add("vrushal");
		s.add("Shreyas");
		
		s.addAll(s);
		
		for(String str:s) {
			System.out.println(str+" "+" "+s);
		}
		
		Set<String> s1 = new HashSet();
		s1.add("s1:Vrushal");
		s1.add("s1:vrushal");
		s1.add("s1:Shreyas");
		s.addAll(s1);
		
		for(String str:s1) {
			System.out.println(str+" "+" "+s1);
		}
		
		

	}

}
