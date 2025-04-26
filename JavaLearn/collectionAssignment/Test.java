/**
 *
 */
package collectionAssignment;

/**
 * @author Ashish.Bele
 *
 */
public class Test {

	public static void main(String [] args){

		Test test = new Test();
		test.add(100);
	}

	public void add(Object o){
System.out.println("Object");
	}

	public void add(Integer o){
		System.out.println("Integer");
	}

	public void add(int o){
		System.out.println("int");
	}


}
