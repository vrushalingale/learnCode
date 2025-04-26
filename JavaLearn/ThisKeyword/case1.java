package ThisKeyword;

//1.The this keyword can be used to refer current class instance variable.

public class case1 
{
	 int id;  
	 String name;  
	      
	 case1(int id,String name)
	    {  
	    	//1.Let's understand the problem if we don't use this keyword by the example
	    	id = id;  
	    	name = name;
	    	
	    	//check result
	    	
	    	//2. Now uncomment this below
	    	//this.id = id;  
	        //this.name = name;
	    	
	    	/*3.If local variables(formal arguments) and instance variables are different, 
	    	there is no need to use this keyword like in the following program:
	    	i.e constructor name:: case1(int i,String n)
	    	*/
	    	
	      }  
	    
/*1.If there is ambiguity between the instance variable and parameter, this keyword resolves the problem of ambiguity.
 * 		1.1. Let's understand the problem if we don't use this keyword by the example
 * 
 *2.In the above example, parameter (formal arguments) and instance variables are same that is why we are using this
 *  keyword to distinguish between local variable and instance variable.
	     * */
	    
	    
	    
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    } 

	public static void main(String[] args) 
	{
		case1 s1 = new case1(111,"Karan");  
		case1 s2 = new case1(321,"Aryan");  
	    s1.display();  
	    s2.display();

	}


}
