package accessModifierP1;

public class A {

	protected  void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
	
	public static void main(String[] args) {
		A a = new A();
		a.display();
	}

} 
  
//class B 
//{ 
//   public static void main(String args[]) 
//      { 
//          A obj = new A(); 
//          //trying to access private method of another class 
//          obj.display(); 
//      } 
//}