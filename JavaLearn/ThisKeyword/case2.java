package ThisKeyword;

//2.this() can be used to invoked current class constructor.

public class case2 
{
	int id;  
    String name;  
    
    case2()
    {
    	System.out.println("default constructor is invoked");
    }  
      
    case2(int id,String name)
    {  
    this ();//it is used to invoked current class constructor.  
    this.id = id;  
    this.name = name;  
    }
    
    void display()
    {
    	System.out.println(id+" "+name);
    }  
	
    public static void main(String args[]){  
    	case2 e1 = new case2(111,"karan");  
    	case2 e2 = new case2(222,"Aryan");  
        e1.display();  
        e2.display();  
       }  

}

/*The this() constructor call can be used to invoke the current class constructor (constructor chaining). 
 * This approach is better if you have many constructors in the class and want to reuse that constructor.*/
