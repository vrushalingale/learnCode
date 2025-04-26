package HelloWorld;

public class HelloWorld {
	
	int i=12;
	
	/*If you declare any variable as static
	 * The static variable can be used to refer the common property of all objects (that is not unique for each object)
	 *  e.g. company name of employees,college name of students etc.
		The static variable gets memory only once in class area at the time of class loading.*/
	static int j=15;
	
	
	/*	As we have mentioned above, static variable will get the memory only once, 
		if any object changes the value of the static variable, it will retain its value.*/
	static int Staticcount=0;
	int count=0;
	
	HelloWorld()
	{  
		Staticcount++;  
		System.out.println("Hello Constructor created and static counter is:"+Staticcount); 
		
		count++;  
		System.out.println("Hello Constructor created and without static variable counter is:"+count);
	}  
	
	static
	{
		//we can execute a program without main() method but only static block executed  but in previous version of JDK 1.7
		System.out.println("static block is invoked");
	}
	
	
	public static void methodone(int i)
	{
		System.out.println(i+j);
		
	}
	
	/*static method
	 *  If you apply static keyword with any method, it is known as static method.
		A static method belongs to the class rather than object of a class.
		A static method can be invoked without the need for creating an instance of a class.
		static method can access static data member and can change the value of it.*/
	
	public static int methodtwo(int i)
	{
		System.out.println(i);
		return i;
	}
	
	public void methodthree()
	{
		System.out.println("Non Static No return method");
	}
	
	public int methodfour(int j)
	{
	System.out.println("Return method Non static");	
	System.out.println(j);
	return i;
	
	}
	
	
	public static void main(String[] args)
	{
	
		//Non static Data type access
	HelloWorld h =new HelloWorld();
	
	System.out.println(h.i);		  //12	
	
	
		//Static data type is access
	System.out.println(HelloWorld.j);    //15
	
	h.methodone(5);		//20
	h.methodtwo(4);		//4
	h.methodthree();	//Non Static No return method
	h.methodfour(1);		//Return method Non static  1
	
	HelloWorld h1 =new HelloWorld();
		
	}

}


/*The static keyword in java is used for memory management mainly. 
 * We can apply java static keyword with variables, methods, blocks and nested class.
 *  The static keyword belongs to the class than instance of the class.
	The static can be:
		1.variable (also known as class variable)
		2.method (also known as class method)
		3.block
		4.nested class
*/