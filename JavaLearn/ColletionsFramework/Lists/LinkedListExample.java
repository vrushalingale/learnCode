package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Java");
		ll.add("C++");
		ll.add("PHP");
		ll.add("Pearl");
		ll.add("Scala");
		ll.add("Python");
		ll.add("Java");
		ll.add("C++");
		
		ll.addAll(ll);
		
		Collections.sort(ll);
		
		for(String str:ll) {
			System.out.println(str);
		}

	}

	

}
