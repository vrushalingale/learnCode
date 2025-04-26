package ThisKeyword;

//4.The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.

public class case5 
{
	 void m(case5 obj)
	 {  
		  System.out.println("method is invoked");  
	 }
	 
	void p()
	{  
		m(this);
		//m();
	}  
		    
	public static void main(String args[])
	{  
		  case5 s1 = new case5();  
		  s1.p();  
		  s1.m(null);
		  s1.m(s1);
		  //s1.m(this);
	}  

}
