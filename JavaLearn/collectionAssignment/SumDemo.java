/**
 *
 */
package collectionAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ashish.Bele
 *
 */
public class SumDemo {

	public static void main(String [] args){

		new SumDemo().findThePairs(new int[] {4, 6, 4,6,5, -10, 8, 5, 20,4}, 10);
	}

	void findThePairs(int [] inputArray, int number){

		Map<Integer, Integer> mapElement = new HashMap<Integer, Integer>();
		for(int i=0;i< inputArray.length;i++){
			if(mapElement.get(inputArray[i])==null){
				for(int j=i+1;j<inputArray.length;j++){
					if(mapElement.get(inputArray[j])==null){
						if(inputArray[i]+inputArray[j]==10){
							mapElement.put(inputArray[i], inputArray[j]);
							System.out.println(inputArray[i]+"+"+inputArray[j]+"=10");
							break;
						}
					}
				}
			}
		}

	}
}
