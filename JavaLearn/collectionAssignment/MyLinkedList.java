/**
 *
 */
package collectionAssignment;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ashish.Bele
 *
 */
public class MyLinkedList {

	public static void main(String [] args){
	List<String> listOfNames = new LinkedList<String>();
	listOfNames.add("Ashish");
	listOfNames.add("Rahul");
	listOfNames.add("Aniket");
	listOfNames.add("Vrushal");
	listOfNames.add("Ashish");
	listOfNames.add("Kunal");
	listOfNames.add("Saurabh");

	listOfNames.add(3, "Arun");

	for(String name : listOfNames){
		System.out.println(name);
	}
	System.out.println("--------------------");
	System.out.println(listOfNames.contains("Ashish"));
	System.out.println("**********************");

	listOfNames.remove(1);
	System.out.println("After Removing at index 1 elememt");
	for(String name : listOfNames){
		System.out.println(name);
	}

	System.out.println("--------------------");
	System.out.println("Index for Vrushal is : "+listOfNames.indexOf("Vrushal"));

	System.out.println("######################");
	listOfNames.set(2, "Test");

	for(String name : listOfNames){
		System.out.println(name);
	}

}

}
