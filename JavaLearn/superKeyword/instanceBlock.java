package superKeyword;

/*Instance Initializer block is used to initialize the instance data member. 
 * It run each time when object of the class is created.
The initialization of the instance variable can be directly but there can be performed extra operations
 while initializing the instance variable in the instance initializer block.*/

public class instanceBlock
{ 
	instanceBlock(){  
		System.out.println("parent class constructor invoked");  
		}  
		}  
		  
		class B3 extends instanceBlock{  
		B3(){  
		super();  
		System.out.println("child class constructor invoked");  
		}  
		  
		B3(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
		}  
		  
		{System.out.println("instance initializer block is invoked");}  
		  
		public static void main(String args[]){  
		B3 b1=new B3();  
		B3 b2=new B3(10);  
		}  
		 
}
