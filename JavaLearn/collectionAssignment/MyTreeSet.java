/**
 *
 */
package collectionAssignment;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ashish.Bele
 *
 */
public class MyTreeSet {

	public static void main(String [] args){
		Set<String> listOfNames = new TreeSet<String>();
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
		System.out.println("After Removing at Aniket");
		for(String name : listOfNames){
			System.out.println(name);
		}

		System.out.println("--------------------");
		System.out.println("Size of hashset is : "+listOfNames.size());


	}

}
