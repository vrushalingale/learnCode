package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(5);
		s.add(6);
		s.add(5);
		s.add(6);
		
		for(int i:s) {
			System.out.println(i+" "+" "+s);
			
		}

	}

}
