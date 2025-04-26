package AbstractClass;

public class AbstractRun {

	public static void main(String[] args) {
		
  /*An abstract class can not be instantiated, i.e 
  (you are not allowed to create object of Abstract class).*/
	
		AbstractClassExample.accountstatement();
		
		
		AbstractClassExample2 ab = new AbstractClassExample2();
		ab.seebalance();
		
		AbstractClassExample a = new AbstractClassExample2();
		a.seebalance();
		
	}

}
