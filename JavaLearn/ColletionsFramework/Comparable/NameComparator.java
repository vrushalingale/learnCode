package Comparable;

import java.util.Comparator;

public class NameComparator implements Comparator {

	public int compare(Object emp1, Object emp2){
		String emp1Name =((Employee)emp1).getName();
		String emp2Name =((Employee)emp2).getName();
		
		
//		if(emp1Name.compareTo(emp2Name))
//			return 1;
//		else if(emp2Name.compareToIgnoreCase(emp1Name))
//			return -1;
//		else		
			return 0;
	}
	
}
