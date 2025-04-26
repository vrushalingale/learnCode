/**
 *
 */
package collectionAssignment;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ashish.Bele
 *
 */
public class MyHashSet {

	public static void main(String [] args){
		Set<String> listOfNames = new HashSet<String>();
		listOfNames.add("Ashish");
		listOfNames.add("Rahul");
		listOfNames.add("Aniket");
		listOfNames.add("Vrushal");
		listOfNames.add("Ashish");
		listOfNames.add("Kunal");
		listOfNames.add("Saurabh");

		for(String name : listOfNames){
			System.out.println(name);
		}
		System.out.println("--------------------");
		System.out.println(listOfNames.contains("Ashish"));
		System.out.println("**********************");

		listOfNames.remove("Aniket");
		System.out.println("After Removing at index 1 elememt");
		for(String name : listOfNames){
			System.out.println(name);
		}

		System.out.println("--------------------");
		System.out.println("Size of hashset is : "+listOfNames.size());


	}

}
