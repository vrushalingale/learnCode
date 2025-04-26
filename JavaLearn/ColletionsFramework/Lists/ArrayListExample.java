package Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("C++");
		al.add("PHP");
		al.add("Pearl");
		al.add("Scala");
		al.add("Python");
		al.add("Java");
		al.add("C++");
		
		al.addAll(al);
		
		Collections.sort(al);
		
		for(String str:al) {
			System.out.println(str);
		}

	}

}
