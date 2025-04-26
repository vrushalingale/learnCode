package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {

	public static void main(String[] args) {
		Employee emp[]= new Employee[2];
		
		
		emp[0]= new Employee();
		emp[0].setAge(27);
		emp[0].setName("Vrushal");
				
		emp[1]= new Employee();
		emp[1].setAge(24);
		emp[1].setName("Shreyas");
		
		System.out.println("Order of Employee Before Sorting...");

		for(int i=0; i<emp.length;i++) {
			System.out.println(" Employee:"+ (i+1) + " name: " + emp[i].getName()+ ", Age: "+ emp[i].getAge());
		}
		
		Arrays.sort(emp, new AgeComparator());
		
		System.out.println("\n Order of Employee after sorting by employee age is..");
		
		for(int i=0; i<emp.length;i++) {
			System.out.println(" Employee:"+ (i+1) + " name: " + emp[i].getName()+ ", Age: "+ emp[i].getAge());
		}
		
		
		Arrays.sort(emp, new NameComparator());
		
		System.out.println("\n Order of Employee after sorting by employee Name is..");
		
		for(int i=0; i<emp.length;i++) {
			System.out.println(" Employee:"+ (i+1) + " name: " + emp[i].getName()+ ", Age: "+ emp[i].getAge());
		}
		
		//javatechiesagar@gmail.com
		
	}

}
