package ThisKeyword;

public class case3 
{
	int id;  
    String name;  
    String city;  
      
    case3()
    {
    	System.out.println("default constructor is invoked");
    }  
    
    case3(int id,String name)
    {  
    	//Call to this() must be the first statement in constructor
    	this();
    	this.id = id;  
    	this.name = name;  
    	
    	//uncomment this and check error message
    	//this();				
    }  
    
    case3(int id,String name,String city)
    {  
    	this(id,name);//now no need to initialize id and name  
    	this.city=city;  
    	
    	//uncomment this and check error message
    	//this();
    }  
    
    void display()
    {
    	System.out.println(id+" "+name+" "+city);
    }  
    
	
    
    public static void main(String args[])
    {  
    	case3 e1 = new case3(111,"karan");  
    	case3 e2 = new case3(222,"Aryan","delhi");  
        e1.display();  
        e2.display();  

}
}

/*Where to use this() constructor call?

The this() constructor call should be used to reuse the constructor in the constructor. 
It maintains the chain between the constructors i.e. it is used for constructor chaining. 
Let's see the example given below that displays the actual use of this keyword.*/