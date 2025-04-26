/**
 *
 */
package collectionAssignment;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Ashish.Bele
 *
 */
public class MyLinkedHashMap {

	public static void main(String [] args){
		Map<Integer,String> MapOfNames = new LinkedHashMap<Integer,String>();
		MapOfNames.put(110, "Ashish");
		MapOfNames.put(130, "Rahul");
		MapOfNames.put(80, "Aniket");
		MapOfNames.put(60, "Saurabh");
		MapOfNames.put(150, "Ashish");
		MapOfNames.put(160, "Kunal");
		MapOfNames.put(130, "Vrushal");
		MapOfNames.put(70, "Arun");


		for(Map.Entry<Integer, String> entry : MapOfNames.entrySet()){
			System.out.println(entry.getValue());
		}
		System.out.println("--------------------");
		System.out.println(MapOfNames.containsKey(130));
		System.out.println("**********************");

		MapOfNames.remove(80);
		System.out.println("After Removing at Aniket");
		for(Map.Entry<Integer, String> entry : MapOfNames.entrySet()){
			System.out.println(entry.getValue());
		}

		System.out.println("--------------------");
		System.out.println("Size of map is : "+MapOfNames.size());


	}

}
