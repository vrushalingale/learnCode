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
public class DuplicateEle {

	public static void main(String [] args){
		Set<Integer> duplicateElementSet = new HashSet<Integer>();
		int[] array = { 1, 1, 2,1,5, 3, 4,4,4, 5, 6, 7, 8,5, 8 };
		for(int i =0 ; i< array.length-1;i++){
			for(int j=i+1 ; j< array.length;j++){
				if(array[i]==array[j] && !duplicateElementSet.contains(array[j])){
					duplicateElementSet.add(array[j]);
					System.out.println("Duplicate Elememt is : "+array[j]);
				}
			}
		}

	}
}