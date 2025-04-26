package Inheritance;

//Inheritance::--Programmer IS-A Employee

public class Programmer extends Employee
{
	int bonus=10000; 
	
	 public static void main(String args[])
	 {  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary (Parent class field) is:"+p.salary);  
	   System.out.println("\nBonus of Programmer (Child class field) is:"+p.bonus);  
	}  

}
