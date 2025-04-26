package ThisKeyword;

//3.The this keyword can be used to invoke current class method (implicitly).
/*You may invoke the method of the current class by using the this keyword. 
 * If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
 *  Let's see the example*/



public class case4 
{
	 void m()
	 {  
		  System.out.println("method is invoked");  
	 }  
	
	 void n()
	 {  
		  this.m();//no need because compiler does it for you.  
	 }
	 
	 void p()
	 {  
		  n();//complier will add this to invoke n() method as this.n()  
	 }  
		  
	 public static void main(String args[])
	 {  
			  case4 s1 = new case4();  
			  s1.p();  
	 }  

}
